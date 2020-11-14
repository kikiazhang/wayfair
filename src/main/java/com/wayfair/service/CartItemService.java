package com.wayfair.service;

import java.util.List;

import com.wayfair.domain.CartItem;
import com.wayfair.domain.Product;
import com.wayfair.domain.ShoppingCart;
import com.wayfair.domain.User;

public interface CartItemService {
	
	CartItem addProductToCartItem(Product product, User user, int qty);
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
	
	CartItem updateCartItem(CartItem cartItem);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem findById(Long id);
	
	CartItem save(CartItem cartItem);

}
