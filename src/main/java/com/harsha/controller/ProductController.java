package com.harsha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.harsha.model.Product;
import com.harsha.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	IProductService iProductService;
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		iProductService.save(product);
		return product;
	}
	
	
	@RequestMapping("/getProducts")
	public List<Product> listOfAllProducts() {
		return iProductService.findAll();
	}
	
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		Product updatedProduct = iProductService.findByProductId(product.getProductId());
		updatedProduct.setProductName(product.getProductName());
		iProductService.save(updatedProduct);
		return product;
	}

	
	@DeleteMapping("/deleteProduct")
	public String deletProduct(@RequestParam("productId") int productId) {
		Product product = iProductService.findByProductId(productId);
		
		if (product != null) {
			iProductService.delete(product);
			return "Product deleted";
		} else {
			return "Data not avaiable or already deleted";
		}
	}
	
	@RequestMapping("/getProduct")
	public Product getProduct(@RequestParam("productId") Integer productId) {
		Product product = iProductService.findByProductId(productId);
		return product;
	}
}
