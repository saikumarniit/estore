package com.musichub.shoes.service;

import java.util.List;

import com.musichub.shoes.model.Customer;
import com.musichub.shoes.model.Product;

public interface ProductServDAO {
	public void addProduct(Product c);
	public List<Product> viewAllProducts();
	public void deleteProduct(Product p);  
	public Product getProduct(int productid);  

}
