package com.ust.authservice.repository;

import com.ust.authservice.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findByUsername(String username);
}
