package com.lis001.invest.service;

import java.util.List;

import com.lis001.invest.dto.Invest;
import com.lis001.invest.dto.InvestRequest;
import com.lis001.invest.dto.Product;

public interface ProductsService {
	List<Product> getAllProducts();
	Product getProduct(Integer id);
	//Invest investProduct(Integer productId, InvestRequest invest);
}
