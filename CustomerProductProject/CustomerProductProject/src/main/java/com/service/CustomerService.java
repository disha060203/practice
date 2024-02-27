package com.service;

import com.model.Customer;

public interface CustomerService {

	Customer addCustomer(Customer c);
	Customer getCustomer(int id);
}
