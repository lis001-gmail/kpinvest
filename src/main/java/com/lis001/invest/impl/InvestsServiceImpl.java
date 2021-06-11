package com.lis001.invest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lis001.invest.dao.InvestsDAO;
import com.lis001.invest.dao.ProductsDAO;
import com.lis001.invest.dto.Invest;
import com.lis001.invest.dto.InvestRequest;
import com.lis001.invest.dto.Product;
import com.lis001.invest.service.InvestsService;

@Service
public class InvestsServiceImpl implements InvestsService {

	@Autowired
	private InvestsDAO dao;

	@Autowired
	private ProductsDAO daoProducts;

	@Override
	public List<Invest> getAllInvests() {
		return dao.getAllInvests();
	}
	
	@Override
	public List<Invest> getInvests(Integer userId) {
		return dao.getInvests(userId);
	}
	
	@Override
	public Invest insertInvest(Invest invest) {
		Invest updatedInvest = new Invest();
		
		if (daoProducts.investProduct(invest.getProductId(), invest) == 1) {
			
			Product product = daoProducts.getProduct(invest.getProductId());
			
			updatedInvest.setProductId(invest.getProductId());
			updatedInvest.setInvestAmount(invest.getInvestAmount());
			updatedInvest.setTitle(product.getTitle());
			updatedInvest.setTotalInvestingAmount(product.getTotalInvestingAmount());
			updatedInvest.setUserId(invest.getUserId());

			//	insertInvest
			dao.insertInvest(invest);
		} else {
			updatedInvest.setInvestAmount(0);

			//	error case : sold out or shortage available investAmount
			
		}
		
		
		return updatedInvest;
	}
}
