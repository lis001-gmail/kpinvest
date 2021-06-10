package com.lis001.invest.dto;

import java.time.LocalDateTime;

public class Product {
	Integer productId;
	String title;
	Integer totalInvestingAmount;
	Integer currentInvestingAmount;
	Integer numberInvestors;
	Integer status;
	LocalDateTime finishedAt;
	
	
	public Product() {
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
	public Integer getCurrentInvestingAmount() {
		return currentInvestingAmount;
	}
	public void setCurrentInvestingAmount(Integer currentInvestingAmount) {
		this.currentInvestingAmount = currentInvestingAmount;
	}
	public Integer getNumberInvestors() {
		return numberInvestors;
	}
	public void setNumberInvestors(Integer numberInvestors) {
		this.numberInvestors = numberInvestors;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getFinishedAt() {
		return finishedAt;
	}
	public void setFinishedAt(LocalDateTime finishedAt) {
		this.finishedAt = finishedAt;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", title=" + title + ", totalInvestingAmount=" + totalInvestingAmount
				+ ", currentInvestingAmount=" + currentInvestingAmount + ", numberInvestors=" + numberInvestors
				+ ", status=" + status + ", finishedAt=" + finishedAt + "]";
	}
	
}
