package com.wayfair.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.Product;


public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByTitleContaining(String keyword);

}
