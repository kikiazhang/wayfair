package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

}
