package com.musichub.shoes.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.shoes.dao.ProductDAO;
import com.musichub.shoes.model.Product;
@Service("productService")
public class ProductService implements ProductServDAO{
	
	@Autowired(required=true)
	private ProductDAO pd;
@Transactional(propagation=Propagation.SUPPORTS)
	public void addProduct(Product c) {
		
	pd.addProduct(c);
	}
@Transactional(propagation=Propagation.SUPPORTS)
	public List<Product> viewAllProducts() {
		return pd.viewAllProducts();
		
	}
	
public void deleteProduct(Product p) {
	pd.deleteProduct(p);
	

}
public Product getProduct(int productid) {
	return  pd.getProduct(productid);
}
@Transactional(propagation=Propagation.SUPPORTS)
public List<Product> getProductByName(String name)
{
return pd.getProductByName(name);
}
}
