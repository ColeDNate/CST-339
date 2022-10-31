package com.gcu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class UserEntity {
	@Id
	String id;
	@Indexed(unique=true)
	String username;
	String password;
	/**
	 * creates a UserEntity that
	 * has the parameters of 
	 * id, username, and password
	 */

}
