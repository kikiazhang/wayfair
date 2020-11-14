package com.wayfair.service;

import com.wayfair.domain.BillingAddress;
import com.wayfair.domain.Order;
import com.wayfair.domain.Payment;
import com.wayfair.domain.ShippingAddress;
import com.wayfair.domain.ShoppingCart;
import com.wayfair.domain.User;

public interface OrderService {

	Order createOrder(
			ShoppingCart shoppingCart, 
			ShippingAddress shippingAddress, 
			BillingAddress billingAddress,
			Payment payment, 
			String shippingMethod, 
			User user
	);

}