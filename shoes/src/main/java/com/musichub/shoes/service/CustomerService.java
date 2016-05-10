package com.musichub.shoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.shoes.dao.CustomerDAO;
import com.musichub.shoes.model.Customer;

@Service("customerService")
public class CustomerService implements CustomerServDAO {
	@Autowired(required=true)
	CustomerDAO cd;

	@Transactional(propagation=Propagation.SUPPORTS)
	public void addCustomer(Customer c) {
		cd.addCustomer(c);
		
	}

	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
