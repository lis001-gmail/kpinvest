package com.lis001.invest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lis001.invest.dto.Invest;

@Repository
public interface InvestsDAO {
	List<Invest> getAllInvests();
	List<Invest> getInvests(Integer userId);
	void insertInvest(Invest invest);
}
