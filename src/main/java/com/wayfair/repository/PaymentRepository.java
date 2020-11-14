package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
