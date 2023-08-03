package com.javatechie.repository;

import com.javatechie.entity.UserCredential;



import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserCredentialRepository  extends MongoRepository<UserCredential, String> {
    Optional<UserCredential> findByName(String username);
}
