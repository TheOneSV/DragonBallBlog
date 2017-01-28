package com.dragonballblog.repository;

import com.dragonballblog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByName(String name);
}
