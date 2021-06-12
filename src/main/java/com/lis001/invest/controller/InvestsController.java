package com.lis001.invest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lis001.invest.dto.Invest;
import com.lis001.invest.service.InvestsService;

@RestController
public class InvestsController {

	@Autowired
	private InvestsService service;
	
	@GetMapping(path = "/invests")
	public List<Invest> getAllInvests() {
		return service.getAllInvests();
	}
	
	@GetMapping(path = "/invests/{id}")
	public List<Invest> getProduct(@PathVariable Integer id) {
		return service.getInvests(id);
	}
	
	@PostMapping(path = "/invests")
	public Invest insertInvest(@RequestBody Invest investRequest) {
		
		//	set temporary userid for test
		//investRequest.setUserId(1);
		
		//	Error code : sold out, 
		Invest returnedInvest = service.insertInvest(investRequest);
		return returnedInvest;
	}
}
