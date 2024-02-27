package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.model.Product;
import com.service.CustomerService;
import com.service.ProductService;

@RestController
@RequestMapping("/c")
@CrossOrigin(origins = "http://localhost:4200")
public class TestCustomerProductController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer c) {
		System.out.println(c);
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
	
	@GetMapping("/getAllProduct")
	 public List<Product> getProducts() {
	        return productService.getProducts();
	    }
}


//addCustomers
/*
	{
    "id":2,
    "name":"Vijsy",
    "products":[
        {
            "productId":1003
            

        },
        {
             "productId":1004
        }
    ]
}
*/


// addProduct

/*
{
"productId":1004,
"productName":"Rice",
"price":150

}
*/