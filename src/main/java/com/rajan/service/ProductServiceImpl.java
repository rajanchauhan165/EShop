package com.rajan.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rajan.model.Product;
import com.rajan.repository.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		return product;
	}

}
