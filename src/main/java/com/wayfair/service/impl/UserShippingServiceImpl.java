package com.wayfair.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wayfair.domain.UserShipping;
import com.wayfair.repository.UserShippingRepository;
import com.wayfair.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	@Override
	public UserShipping findById(Long id) {
		// TODO Auto-generated method stub
		return userShippingRepository.findOne(id);
	}

	@Override
	public void removeById(long id) {
		// TODO Auto-generated method stub
		userShippingRepository.delete(id);
	}
	
}
