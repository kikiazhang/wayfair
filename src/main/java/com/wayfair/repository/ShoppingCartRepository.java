package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{

}
