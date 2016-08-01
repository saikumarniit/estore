package com.niitconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niitconnect.dao.BlogDao;
import com.niitconnect.model.Blog;

@Service
public class BlogDaoServiceImpl implements BlogDaoService {
	@Autowired
	private BlogDao dao;
	public void addBlog(Blog blog) {
		
		dao.addBlog(blog);
	}

}
