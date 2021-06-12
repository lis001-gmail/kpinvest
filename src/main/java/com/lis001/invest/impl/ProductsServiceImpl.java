package com.lis001.invest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lis001.invest.dao.ProductsDAO;
import com.lis001.invest.dto.Product;
import com.lis001.invest.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDAO dao;
	
	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}
	
	@Override
	public Product getProduct(Integer id) {
		return dao.getProduct(id);
	}

	/*
	@Override
	public Invest investProduct(Integer productId, InvestRequest invest) {
		Invest updatedInvest = new Invest();
		
		if (dao.investProduct(productId, invest) == 1) {
			
			Product product = getProduct(productId);
			
			updatedInvest.setProductId(productId);
			updatedInvest.setInvestAmount(invest.getInvestAmount());
			updatedInvest.setTitle(product.getTitle());
			updatedInvest.setTotalInvestingAmount(product.getTotalInvestingAmount());
			updatedInvest.setUserId(invest.getUserId());
		} else {
			updatedInvest.setInvestAmount(0);
		}
		
		return updatedInvest;
	}
	*/
}
