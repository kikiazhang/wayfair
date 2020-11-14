package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.BillingAddress;

public interface BillingAddressRepository extends CrudRepository<BillingAddress, Long>{

}
