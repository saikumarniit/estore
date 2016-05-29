
package com.musichub.shoes.dao;


import java.util.List;

import com.musichub.shoes.model.*;
public interface ProductDAO {
	
	public void addProduct(Product c);
	public List<Product> viewAllProducts();
	public void deleteProduct(Product p);  
	public Product getProduct(int productid);  
	public List<Product> getProductByName(String name);
}
