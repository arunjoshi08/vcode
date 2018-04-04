package com.home.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.app.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
