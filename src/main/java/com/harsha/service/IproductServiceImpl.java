package com.harsha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsha.dao.IProductDao;
import com.harsha.model.Product;

@Service("iProductService")
public class IproductServiceImpl implements IProductService{
	
	@Autowired
	IProductDao iProductDao;

	@Override
	public Product findByProductId(int productId) {
		// TODO Auto-generated method stub
		Product product = iProductDao.findByProductId(productId);
		if (product != null) {
			return product;
		} else {
			return product;
		}
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return iProductDao.save(product);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return iProductDao.findAll();
	}

	@Override
	public void delete(Product product) {
		iProductDao.delete(product);
	}

}
