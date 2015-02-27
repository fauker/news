package com.fauker.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fauker.news.exception.NewsException;
import com.fauker.news.util.ConnectionFactory;

@Controller
public class BaseController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() throws NewsException {
        ConnectionFactory.create();
        return "../../login";
	}
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }	
	
}
