package com.jbk.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.boot.entity.Product;
import com.jbk.boot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	public ProductRepository productrepo;
	
	public List<Product>getAllProduct(){
		List<Product>product=new ArrayList<>();
		productrepo.findAll().forEach(product::add);
		return product;
		
	}
	public void addProduct(Product product) {
		productrepo.save(product);
	}
	public void updateproduct(String productId, Product product) {
		productrepo.save(product);
		
	}
	public void deleteProduct(String productId) {
		productrepo.deleteById(productId);
		
	}
}
