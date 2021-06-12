package com.lis001.invest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lis001.invest.dto.Invest;
import com.lis001.invest.dto.Product;

@Repository
public interface ProductsDAO {
	List<Product> getAllProducts();
	Product getProduct(Integer id);
	Integer getInvestingAmountForUpdate(Integer id);
	Integer investProduct(@Param("productId") Integer productId, @Param("invest") Invest invest);
}
