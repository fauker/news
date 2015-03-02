package com.fauker.news.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fauker.news.model.Comment;
import com.fauker.news.model.News;
 
@Controller
@RequestMapping(value = "/comment")
public class CommentController {

	
	@RequestMapping(value = "/news/{id}", method = RequestMethod.GET)
	public String showComments(@PathVariable Long id, Model model) {
		
		
		model.addAttribute("comments", Comment.findByIdNews(id));
		model.addAttribute("news", News.findById(id));
		
		return "comment";
		
	}
	
	@RequestMapping(value = "/save/news/{newsId}", method = RequestMethod.POST)
	public String save(@Valid Comment comment, BindingResult result, @PathVariable Long newsId, Model model) {
		
		if (!result.hasErrors()) {

			try {
				News news = News.findById(newsId);
				comment.setNews(news);
				comment.save();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return showComments(newsId, model);
	}
	
}
 