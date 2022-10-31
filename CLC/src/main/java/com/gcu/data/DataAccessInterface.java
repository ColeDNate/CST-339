package com.gcu.data;

import java.util.List;

public interface DataAccessInterface <T> {
	/**
	 * Data access interface
	 */
	public List<T> findAll();
	public boolean create(T t);
	public boolean update(T t);
	public boolean delete(T t);
}
