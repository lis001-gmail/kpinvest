package com.lis001.invest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lis001.invest.common.enums.ExceptionEnum;
import com.lis001.invest.common.response.ApiException;
import com.lis001.invest.dao.InvestsDAO;
import com.lis001.invest.dao.ProductsDAO;
import com.lis001.invest.dto.Invest;
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
	@Transactional
	public Invest insertInvest(Invest invest) {
		Invest updatedInvest = new Invest();
		
		daoProducts.getInvestingAmountForUpdate(invest.getProductId());
		Integer ret = daoProducts.investProduct(invest.getProductId(), invest); 

		if (ret == 1) {	
			//	invest 성공
			Product product = daoProducts.getProduct(invest.getProductId());
			
			updatedInvest.setProductId(invest.getProductId());
			updatedInvest.setInvestAmount(invest.getInvestAmount());
			updatedInvest.setTitle(product.getTitle());
			updatedInvest.setTotalInvestingAmount(product.getTotalInvestingAmount());
			updatedInvest.setUserId(invest.getUserId());

			//	insertInvest
			dao.insertInvest(invest);
		} else {
			//	invest 실패
			updatedInvest.setInvestAmount(0);

			//	error case : sold out or shortage available investAmount
			throw new ApiException(ExceptionEnum.SOLDOUT);
			//throw new ApiException(ExceptionEnum.SECURITY_01);
		}

		return updatedInvest;
	}
}
