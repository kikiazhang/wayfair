package com.wayfair.service;

import com.wayfair.domain.UserShipping;

public interface UserShippingService {
	
	UserShipping findById(Long id);
	
	void removeById(long parseLong);

}
