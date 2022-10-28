package com.gcu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CLC")
public class EventEntity {
	//not sure if "id" is needed
	@Id
	public String id;
	public String name;
	public int year;
	public int month;
	public int day;
	public int hour;
	public int minute;
	//org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'eventRepository' 
	//defined in com.gcu.EventRepository defined in @EnableMongoRepositories declared on 
	//MongoRepositoriesRegistrar.EnableMongoRepositoriesConfiguration: Invocation of init method failed; 
	//nested exception is org.springframework.data.repository.query.QueryCreationException: Could not create query for 
	//public abstract void 
	//com.gcu.EventRepository.insert(java.lang.String,java.lang.String,java.lang.String,int,int,int,int,int); 
	//Reason: No property 'insert' found for type 'EventEntity'; nested exception is 
	//org.springframework.data.mapping.PropertyReferenceException: No property 'insert' found for type 'EventEntity'

	public EventEntity() {
		
	}
	
	public EventEntity(String id, String name, int year, int month, int day,
			int hour, int minute) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}
	
	@Override
	public String toString() {
		return String.format("id=%s, name='%s', year='%s', month='%s', "
				+ "day='%s', hour='%s', minute='%s'", id, name, year, month, day, hour, minute);
	}
	
	
}
