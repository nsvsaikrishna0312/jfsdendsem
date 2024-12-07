package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("add")
	public String addCustomer(@RequestBody Customer c) {
		return customerService.addCustomer(c);
	}
	
	@GetMapping("viewall")
	public List<Customer> viewallcustomers(){
		return customerService.viewAll();
	}
}
