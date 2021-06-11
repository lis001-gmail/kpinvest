package com.lis001.invest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lis001.invest.dto.Product;
import com.lis001.invest.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService service;
	
	@GetMapping(path = "/products")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@GetMapping(path = "/products/{id}")
	public Product getProduct(@PathVariable Integer id) {
		return service.getProduct(id);
	}
}
