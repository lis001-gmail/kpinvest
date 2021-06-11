package com.lis001.invest.service;

import java.util.List;

import com.lis001.invest.dto.Invest;
import com.lis001.invest.dto.InvestRequest;

public interface InvestsService {
	List<Invest> getAllInvests();
	List<Invest> getInvests(Integer userId);
	Invest insertInvest(Invest invest);
}
