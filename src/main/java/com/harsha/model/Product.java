package com.harsha.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(generator = "product1", strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "product1", sequenceName = "product1", initialValue = 1, allocationSize = 1)
	@Id
	private int productId;

	private String productName;
	
	public Product() {

	}
	
	
	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
