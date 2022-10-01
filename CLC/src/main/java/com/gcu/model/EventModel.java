package com.gcu.model;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


//Start class
public class EventModel{
	
	//variables?
	@NotNull(message="Event name is a required field")
	@Size(min=1, max=32, message="User name must between 1 and 32 characters")
	private String eventName;
	private Calendar eventDate;
	
	//simple date constructor
	public EventModel(String eventName, int year, int month, int day) {
		setEventName(eventName);
		setDate(year, month, day);
	}
	//date and time constructor
	public EventModel(String eventName, int year, int month, int day, int hour, int minute) {
		setEventName(eventName);
		setDate(year, month, day, hour, minute);
	}
	//string and calendar overload
	public EventModel(String eventName, Calendar eventDate) {
		setEventName(eventName);
		setDate(eventDate);
	}
	
	
	//event name
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/*** EVENT DATE FUNCTIONS ****/
	//event date
	public Calendar getEventDate() {
		return eventDate;
	}
	//simple date (just a day)
	public void setDate(int year, int month, int day) {
		eventDate = Calendar.getInstance();
		eventDate.set(year, month, day);
	}
	//date with time
	public void setDate(int year, int month, int day, int hour, int minute) {
		eventDate = Calendar.getInstance();
		eventDate.set(year, month, day, hour, minute);
	}
	public void setDate(Calendar date) {
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);
		int hour = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);

		eventDate = Calendar.getInstance();
		eventDate.set(year, month, day, hour, minute);
	}
	
	//GET INDIVIDUAL FIELDS
	public int getYear() {
		return eventDate.get(Calendar.YEAR);
	}
	public int getMonth() {
		return eventDate.get(Calendar.MONTH);
	}
	public int getDay() {
		return eventDate.get(Calendar.DAY_OF_MONTH);
	}
	public int getHour() {
		return eventDate.get(Calendar.HOUR);
	}
	public int getMinute() {
		return eventDate.get(Calendar.MINUTE);
	}
	
	
	
}
