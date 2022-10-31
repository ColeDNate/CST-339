package com.gcu;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gcu.entity.EventEntity;

public interface EventRepository extends MongoRepository<EventEntity, String> {
	/**
	 * @author matthewrmccormack
	 * @param string
	 * @param id
	 * @param name
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 */
	 void insert(String string, String id, String name, int year, int month, int day, int hour, int minute);

}
