package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Product;
import com.app.service.productService;

@RestController
@RequestMapping("/product")
public class ProductController {
	//dep:ProductSservice
	@Autowired
	private productService prodService;
	
	public ProductController() {
		// TODO Auto-generated constructor stub
		System.out.println("in ctor of "+getClass());
	}

	@GetMapping
	public List<Product> showProduct()
	{
		System.out.println("in show product");
		return prodService.getallProducts();
	}
	
	@PostMapping
	public ResponseEntity<Product> addProduct(@RequestBody Product transientProd)
	{
		System.out.println("in addProduct");
		return new ResponseEntity<>(prodService.addProductDetails(transientProd),HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<?> updateStudent(@RequestBody Product detachedProduct)
	{
		return new ResponseEntity<>(prodService.updateProduct(detachedProduct),HttpStatus.CREATED);
	}
	
	
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id)
	{
		return prodService.removeProduct(id);
	}
	
}
