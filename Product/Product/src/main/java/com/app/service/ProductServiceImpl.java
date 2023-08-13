package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.Product;
import com.app.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements productService {

	//dep:product REpository i/f
	@Autowired
	private ProductRepository prodRepo;
	@Override
	public List<Product> getallProducts() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

	@Override
	public Product addProductDetails(Product transientProd) {
		// TODO Auto-generated method stub
		return prodRepo.save(transientProd);
	}

	@Override
	public ApiResponse updateProduct(Product detachedProduct) {
		String msg="Updating  Product  Failed";
		Product prod=prodRepo.save(detachedProduct);
		if(prod != null)
		{
			msg="Product details updated Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public String removeProduct(Long id) {
		String mesg="Id invalid cannot delete record";
		if(prodRepo.existsById(id))
		{
			prodRepo.deleteById(id);
			mesg="Deleted Successfully";
		}
		
		return mesg;
	
	}

}
