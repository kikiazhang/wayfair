package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.UserBilling;

public interface UserBillingRepository extends CrudRepository<UserBilling, Long> {

}
