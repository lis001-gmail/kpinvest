package com.lis001.invest.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lis001.invest.dto.Invest;
import com.lis001.invest.service.InvestsService;

@RestController
public class InvestsController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private InvestsService service;
	
	@GetMapping(path = "/invests")
	public List<Invest> getInvests(@RequestAttribute Integer userId) {
		return service.getInvests(userId);
	}
		
	@PostMapping(path = "/invests")
	public Invest insertInvest(final @RequestBody @Valid Invest investRequest, @RequestAttribute Integer userId) {
        logger.debug("[MYTEST] post invests : userId - " + userId);
		
		//	set temporary userid for test
		investRequest.setUserId(userId);
		
		//	Error code : sold out, 
		Invest returnedInvest = service.insertInvest(investRequest);
		return returnedInvest;
	}
}
