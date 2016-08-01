package com.niitconnect.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niitconnect.model.Blog;

@Repository
public class BlogDaoImpl implements BlogDao {
	@Autowired
	SessionFactory factory;
	public void addBlog(Blog blog) {
		System.out.println(" I am in addblog");
		Session session=factory.getCurrentSession();
		  Transaction tx=session.beginTransaction();
		 session.saveOrUpdate(blog);
		 tx.commit();
		
	}

}
