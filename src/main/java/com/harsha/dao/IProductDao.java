package com.harsha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harsha.model.Product;

@Repository("iProductDao")
public interface IProductDao extends JpaRepository<Product, Integer>  {
	
	public Product findByProductId(int productId);

}
