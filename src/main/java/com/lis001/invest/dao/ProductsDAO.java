package com.lis001.invest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lis001.invest.dto.Product;

@Repository
public interface ProductsDAO {
	List<Product> getAllProducts();
}
