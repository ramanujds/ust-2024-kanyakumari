package com.ust.app.springsecurity.repository;

import com.ust.app.springsecurity.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
    Optional<UserModel> findByUsername(String username);
}
