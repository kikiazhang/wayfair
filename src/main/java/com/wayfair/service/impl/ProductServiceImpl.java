package com.wayfair.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wayfair.domain.Product;
import com.wayfair.repository.ProductRepository;
import com.wayfair.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		List<Product> productList = (List<Product>) productRepository.findAll();
		
		List<Product> activeProductList = new ArrayList<>();
		
		for (Product product : productList) {
			if(product.isActive()) {
				activeProductList.add(product);
			}
		}
		
		return activeProductList;
	}

	@Override
	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> blurrySearch(String keyword) {
		List<Product> productList = (List<Product>) productRepository.findByTitleContaining(keyword);
		
		List<Product> activeProductList = new ArrayList<>();
		
		for (Product product : productList) {
			if(product.isActive()) {
				activeProductList.add(product);
			}
		}
		
		return activeProductList;
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		productRepository.delete(id);
	}
	
	
}
