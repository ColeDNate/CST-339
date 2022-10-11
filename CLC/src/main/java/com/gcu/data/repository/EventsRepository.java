package com.gcu.data.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.gcu.data.EventEntity;

public interface EventsRepository extends CrudRepository<EventEntity, Long>{
	
	//example of overriding from CrudRepo
	@Override
	@Query(value = "SELECT * FROM EVENTS")
	public List<EventEntity> findAll();
	
}
