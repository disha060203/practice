package com.service;

import java.util.List;

import com.model.Customer;
import com.model.Product;

public interface ProductService {

	Product addProduct(Product p);
	List<Product> getProducts();
}
