package com.musichub.shoes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.shoes.model.Customer;
import com.musichub.shoes.model.UserRole;

@Repository("custDAO")
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired(required=true)
	private SessionFactory factory;
	
@Transactional(propagation=Propagation.SUPPORTS)
	public void addCustomer(Customer u) {
		Session s=factory.getCurrentSession();
		Transaction t=s.beginTransaction();
		u.setEnabled(true);
		s.saveOrUpdate(u);
		UserRole role=new UserRole();
		role.setAuthority("ROLE_USER");
	    role.setUser_role_id(u.getId());
		s.saveOrUpdate(role);
		t.commit();
	}

	public List<Customer> viewUsers() {
		
		return null;
	}

}
