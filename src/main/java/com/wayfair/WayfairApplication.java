package com.wayfair;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wayfair.config.SecurityUtility;
import com.wayfair.domain.User;
import com.wayfair.domain.security.Role;
import com.wayfair.domain.security.UserRole;
import com.wayfair.service.UserService;

@SpringBootApplication
//@EnableCaching
public class WayfairApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WayfairApplication.class, args);
	}

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("Adams");
		user1.setUsername("JAdams");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("12345678"));
		user1.setEmail("JAdams@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);

		userRoles.clear();

		User user2 = new User();
		user2.setFirstName("Admin");
		user2.setLastName("Admin");
		user2.setUsername("Admin");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("12345678"));
		user2.setEmail("Admin@gmail.com");
		Role role2 = new Role();
		role2.setRoleId(0);
		role2.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user2, role2));

		userService.createUser(user2, userRoles);
	}
}
