package com.gcu;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gcu.entity.EventEntity;

public interface EventRepository extends MongoRepository<EventEntity, String> {

}
