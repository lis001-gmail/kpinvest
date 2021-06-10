package com.lis001.invest.dto;

import java.time.LocalDateTime;

public class Invest {
	Integer productId;
	String title;
	Integer totalInvestingAmount;
	Integer investAmount;
	LocalDateTime attendedAt;
	
	
	public Invest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getTotalInvestingAmount() {
		return totalInvestingAmount;
	}
	public void setTotalInvestingAmount(Integer totalInvestingAmount) {
		this.totalInvestingAmount = totalInvestingAmount;
	}
	public Integer getInvestAmount() {
		return investAmount;
	}
	public void setInvestAmount(Integer investAmount) {
		this.investAmount = investAmount;
	}
	public LocalDateTime getAttendedAt() {
		return attendedAt;
	}
	public void setAttendedAt(LocalDateTime attendedAt) {
		this.attendedAt = attendedAt;
	}
	@Override
	public String toString() {
		return "invest [productId=" + productId + ", title=" + title + ", totalInvestingAmount=" + totalInvestingAmount
				+ ", investAmount=" + investAmount + ", attendedAt=" + attendedAt + "]";
	}

	
}
