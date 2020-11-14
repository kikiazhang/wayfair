package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.ShippingAddress;

public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long> {
	
}
