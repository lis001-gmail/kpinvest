package com.lis001.invest.dto;

public class InvestRequest {
	Integer userId;
	Integer productId;
	Integer investAmount;
	
	
	public InvestRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getInvestAmount() {
		return investAmount;
	}
	
	public void setInvestAmount(Integer investAmount) {
		this.investAmount = investAmount;
	}

	@Override
	public String toString() {
		return "InvestRequest [userId=" + userId + ", productId=" + productId + ", investAmount=" + investAmount + "]";
	}

	
}
