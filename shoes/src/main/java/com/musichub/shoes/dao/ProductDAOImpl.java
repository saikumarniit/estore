package com.musichub.shoes.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.shoes.model.Product;

@Repository("prodDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired(required=true)
	private SessionFactory factory;
	@Transactional(propagation=Propagation.SUPPORTS)
	public void addProduct(Product p) {
		Session s=factory.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(p);
		t.commit();		
	}

	@SuppressWarnings("unchecked")
	public List<Product> viewAllProducts() {
		Session s=factory.getCurrentSession();
		Transaction t=s.beginTransaction();
		List<Product> ls=s.createCriteria(Product.class).list();
		t.commit();
		return ls;
		
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public void deleteProduct(Product p) {
		Session s=factory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("In Delete Product: pid:"+p.getId());
		Query query=s.createQuery("delete from Product where prod_id=:status");
		query.setInteger("status",p.getId());
		int rowsDeleted=query.executeUpdate();
		System.out.println("value of i:"+rowsDeleted);
		t.commit();
		
	}

	public Product getProduct(int productid) {
		
		Session s=factory.getCurrentSession();
		Transaction t=s.beginTransaction(); 
	
				 
				 return (Product)s.get(Product.class, productid); 
	}

	public List<Product> getProductByName(String name) {
		Session s=factory.getCurrentSession();
		Transaction t=s.beginTransaction(); 
		Query q=s.createQuery("from Product p where description='"+name+"'");
		List<Product> ls=q.list();
		t.commit();
		return ls;
	}

	

}
