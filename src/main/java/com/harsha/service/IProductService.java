package com.harsha.service;

import java.util.List;

import com.harsha.model.Product;


public interface IProductService {
	
	public Product findByProductId(int productId);
	
	public Product save(Product product);

	public List<Product> findAll();

	public void delete(Product product);

}
