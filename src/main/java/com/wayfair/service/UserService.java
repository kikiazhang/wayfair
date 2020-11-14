package com.wayfair.service;

import java.util.Set;

import com.wayfair.domain.User;
import com.wayfair.domain.UserBilling;
import com.wayfair.domain.UserPayment;
import com.wayfair.domain.UserShipping;
import com.wayfair.domain.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);
	
	User findByEmail(String email);
	
	User findByUsername(String username);
	
	User save (User user);
	
	User findById(Long id);

	void updateUserPaymentInfo(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);

	void setUserDefaultShipping(Long userShippingId, User user);

}
