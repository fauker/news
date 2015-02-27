package com.fauker.news.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fauker.news.model.News;
import com.fauker.news.util.Paginator;

@Controller
@RequestMapping(value = "/news")
public class NewsController {
	
	@Autowired
	private Paginator paginator;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String show(Model model) {
		return this.showPage(model, 1);
	}
	
	@RequestMapping(value = "/{page}", method = RequestMethod.GET)
	public String showPage(Model model, @PathVariable Integer page) {
		
		paginator.setCurrentPage(page);
		
		model.addAttribute("news", News.findAll(paginator));
		model.addAttribute("newsForm", new News());
		model.addAttribute("pageCount", paginator.getPageCount());
		
		return "news";
		
	}
	
	public String save(@Valid News news, BindingResult result, Model model) {
		
		if (!result.hasErrors()) {
			try {
				news.save();
				model.addAttribute("msgSuccess", "form.save.success");
			} catch (Exception e) {
				model.addAttribute("msgError", e.getMessage());
			}
		}
		
		return this.show(model);
	}
	
}
