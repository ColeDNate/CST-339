package com.gcu.model;

import java.util.Calendar;


//Start class
public class EventModel{
	
	//variables?
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
