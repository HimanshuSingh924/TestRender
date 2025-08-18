package com.testRender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testRender.service.OperatorService;

@RestController
@RequestMapping("/UseOperators")
public class OperatorsCont {

	OperatorService operatorService;
	
	public OperatorsCont(OperatorService operatorService) {
		this.operatorService=operatorService;
	}
	
	@GetMapping("/add")
	public int add() {
		return operatorService.add();
	}
}
