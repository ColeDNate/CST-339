package com.gcu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gcu.entity.UserEntity;

/**
 * 
 * @author matthewrmccormack
 * interface
 *
 */
public interface UserRepository extends MongoRepository<UserEntity, String> {
	/**
	 * 
	 * @param username
	 * @return
	 */
	UserEntity findByUsername(String username);
}
