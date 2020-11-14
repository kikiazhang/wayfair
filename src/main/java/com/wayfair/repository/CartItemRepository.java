package com.wayfair.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.CartItem;
import com.wayfair.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
}
