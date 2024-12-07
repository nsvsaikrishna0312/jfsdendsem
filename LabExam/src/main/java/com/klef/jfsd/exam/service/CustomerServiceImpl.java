package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public String addCustomer(Customer c) {
		customerRepository.save(c);
		return "Customer Added Succesfully";
	}

	@Override
	public List<Customer> viewAll() {
		return (List<Customer>)customerRepository.findAll();
	}

}
