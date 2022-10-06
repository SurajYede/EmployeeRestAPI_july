package com.jbk.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.boot.entity.Product;
import com.jbk.boot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;

	@RequestMapping(method=RequestMethod.GET,value="/getAllProduct")
	public List<Product>getAllProduct(){
		return service.getAllProduct();
			
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addproduct(@RequestBody Product product) {
		
		service.addProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/products/{productId}")
	public void updateproduct(@PathVariable String productId,@RequestBody Product product) {
		
		service.updateproduct(productId,product);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{productId}")
	public void deleteProduct(@PathVariable String productId) {
		service.deleteProduct(productId);
	}
	
}
