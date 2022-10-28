package com.gcu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gcu.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String> {
	UserEntity findByUsername(String username);
}
