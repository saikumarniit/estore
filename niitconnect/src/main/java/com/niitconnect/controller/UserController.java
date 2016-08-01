package com.niitconnect.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niitconnect.model.Blog;
import com.niitconnect.service.BlogDaoService;

@Controller
public class UserController {
	@Autowired
	BlogDaoService service;

	@RequestMapping("/blog")
	public ModelAndView blog()
	{
		return new ModelAndView("blog");
	}
	@RequestMapping("/addBlog")
	public ModelAndView addBlog()
	{
		return new ModelAndView("addBlog","blogmodel",new Blog());
	}
	@RequestMapping("/submitBlog")
	public String submitBlog(HttpServletRequest request,ModelMap model,@Valid @ModelAttribute("blogmodel") Blog blog,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "addBlog";
		}
		service.addBlog(blog);
		return "redirect:/addBlog?info=blog added successfully";
	}
}
