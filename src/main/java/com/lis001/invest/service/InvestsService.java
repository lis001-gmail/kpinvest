package com.lis001.invest.service;

import java.util.List;

import com.lis001.invest.dto.Invest;

public interface InvestsService {
	List<Invest> getInvests(Integer userId);
	Invest insertInvest(Invest invest);
}
