package com.jbk.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.jbk.boot.entity.Product;

public interface ProductRepository extends CrudRepository<Product,String>{

	
	
}
