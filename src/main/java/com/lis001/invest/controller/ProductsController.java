package com.lis001.invest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.lis001.invest.dto.Product;
import com.lis001.invest.service.ProductsService;

public class ProductsController {
	@Autowired
	private ProductsService service;
	
	@GetMapping(path = "/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
}
