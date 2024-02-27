package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	@Override
	public Customer addCustomer(Customer c) {
		
		return customerRepo.save(c);
	}

	@Override
	public Customer getCustomer(int id) {
		
		return customerRepo.findById(id).orElse(null);
	}

	

	
}
