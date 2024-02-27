package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.model.Product;
import com.service.CustomerService;
import com.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")


public class TestCustomerProductController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer c) {
		
		return customerService.addCustomer(c);
	}
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product p) {
		
		return productService.addProduct(p);
	}
	
	@GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable("id") int id)
    {
        return customerService.getCustomer(id);
    }
	
}
