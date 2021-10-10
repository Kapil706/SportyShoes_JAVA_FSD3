package com.pro.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.pro.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

	List<Product> findByBrand(String brand);

	List<Product> findBySeason(String season);

	List<Product> findByCategory(String category);

	List<Product> findByPrice(String price);
	
	List<Product> findByColor(String color);

}