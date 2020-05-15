package com.ecomapp.springbootecommerce.dao;

import com.ecomapp.springbootecommerce.entity.Role;
import com.ecomapp.springbootecommerce.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
