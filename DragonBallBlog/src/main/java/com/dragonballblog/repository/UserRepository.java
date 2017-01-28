package com.dragonballblog.repository;

import com.dragonballblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByEmail(String email);
}
