package com.gcu.data;

public interface UserDataAccessInterface <T> {
	/**
	 * @param username
	 * this creates an access interface
	 */
	public T findByUsername(String username);
}
