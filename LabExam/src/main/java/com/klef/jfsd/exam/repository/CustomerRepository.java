package com.klef.jfsd.exam.repository;

import org.springframework.data.repository.CrudRepository;

import com.klef.jfsd.exam.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
