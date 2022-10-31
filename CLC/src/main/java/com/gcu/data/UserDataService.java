package com.gcu.data;

import java.util.List;

import com.gcu.entity.UserEntity;
import com.gcu.repository.UserRepository;

public class UserDataService implements DataAccessInterface, UserDataAccessInterface  {

	UserRepository userRepo;
	/**
	 * This creates a UserRepository in the static userRepo
	 */
	
	/**
	 *@param username
	 *@return
	 */
	@Override
	public UserEntity findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	/**
	 * @return
	 */
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/**
	 * @return
	 */
	public boolean create(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	/**
	 * @return
	 */
	public boolean update(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	/**
	 * @return
	 */
	public boolean delete(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object findById(int id) {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
