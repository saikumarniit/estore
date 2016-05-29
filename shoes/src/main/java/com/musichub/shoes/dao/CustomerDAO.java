package com.musichub.shoes.dao;

import java.util.List;

import com.musichub.shoes.model.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer u);
	List<Customer> viewUsers();
	public void deleteUser(Customer c);

}
