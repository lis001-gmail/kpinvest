package com.lis001.invest.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

public class Invest {
	Integer investId;
	Integer userId;
	@NotNull
	Integer productId;
	String title;
	Integer totalInvestingAmount;
	@NotNull
	Integer investAmount;
	LocalDateTime attendedAt;
	
	
	public Invest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getInvestId() {
		return investId;
	}

	public void setInvestId(Integer investId) {
		this.investId = investId;
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
		return "Invest [investId=" + investId + ", userId=" + userId + ", productId=" + productId + ", title=" + title
				+ ", totalInvestingAmount=" + totalInvestingAmount + ", investAmount=" + investAmount + ", attendedAt="
				+ attendedAt + "]";
	}

	
}
