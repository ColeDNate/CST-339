package com.gcu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CLC")
public class EventEntity {
	//not sure if "id" is needed
	@Id String id;
	String name;
	int year;
	int month;
	int day;
	int hour;
	int minute;
	
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
