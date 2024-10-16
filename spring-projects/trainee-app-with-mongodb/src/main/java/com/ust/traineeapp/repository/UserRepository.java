package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.UserModel;
import com.ust.traineeapp.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface UserRepository extends MongoRepository<UserModel, BigInteger> {

    Optional<UserModel> findByUsername(String username);

}
