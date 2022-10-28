package com.gcu.data;

import java.util.List;

import com.gcu.entity.UserEntity;
import com.gcu.repository.UserRepository;

public class UserDataService implements DataAccessInterface, UserDataAccessInterface  {

	UserRepository userRepo;
	
	@Override
	public UserEntity findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object t) {
		// TODO Auto-generated method stub
		return false;
	} 
	
}
