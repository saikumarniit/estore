package com.musichub.dao;

import java.util.ArrayList;
import java.util.List;

import com.musichub.model.Product;

public class ProductDAOImpl implements ProductDAO {

	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product p1=new Product();
		p1.setId(101);
		p1.setName("guitar");
		p1.setPrice(2000.56);
		p1.setDescription("This is a guitar");
		Product p2=new Product();
		p2.setId(102);
		p2.setName("tabla");
		p2.setPrice(200.56);
		p2.setDescription("This is a tabla");
		Product p3=new Product();
		p3.setId(103);
		p3.setName("voilon");
		p3.setPrice(200.12);
		p3.setDescription("This is a voilon");
		products.add(p1);
		products.add(p2);
		products.add(p3);
		return products;
	}

}
