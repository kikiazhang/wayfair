package com.wayfair.repository;

import org.springframework.data.repository.CrudRepository;

import com.wayfair.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
