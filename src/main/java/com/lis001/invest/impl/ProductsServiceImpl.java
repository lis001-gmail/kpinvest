package com.lis001.invest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lis001.invest.dao.ProductsDAO;
import com.lis001.invest.dto.Product;
import com.lis001.invest.service.ProductsService;

public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDAO dao;
	
	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}
}
