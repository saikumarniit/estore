package com.musichub.shoes.service;

import java.util.List;

import com.musichub.shoes.model.Customer;

public interface CustomerServDAO {
	public void addCustomer(Customer c);
	List<Customer> viewUsers();
	public void deleteUser(Customer c);

}
