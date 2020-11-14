package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.CartItem;
import com.wayfair.domain.ProductToCartItem;

public interface ProductToCartItemRepository extends CrudRepository<ProductToCartItem, Long>{
	void deleteByCartItem(CartItem cartItem);
}
