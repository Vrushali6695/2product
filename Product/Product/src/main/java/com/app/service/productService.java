package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.entities.Product;


public interface productService {
	
	
	List<Product> getallProducts();
	
	Product addProductDetails(Product transientProd);
	
	ApiResponse updateProduct(Product detachedBook);
		
	String removeProduct(Long id);

}
