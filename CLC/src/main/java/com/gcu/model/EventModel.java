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
	
	//placeholder variables
	@NotNull(message="Event year is a required field")
	private int year;
	@NotNull(message="Event month is a required field")
	private int month;
	@NotNull(message="Event day is a required field")
	private int day;
	
	
	
	/*** CONSTRUCTORS ***/
	//default constructor
	public EventModel() {
		setEventName("Some Fake Event");
		setDate(1, 1, 1);
	}
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
	
	
	/*** ACCESSORS AND MUTATORS ***/
	
	//event name
	
	/**
	 * @return String eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * sets event name
	 * @param eventName
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/* EVENT DATE FUNCTIONS */
	
	
	//Year
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return Calendar.year value of event.Date
	 */
	public int getYear() {
		return eventDate.get(Calendar.YEAR);
	}
	//month
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return Calendar.month value of event.Date
	 */
	public int getMonth() {
		return eventDate.get(Calendar.MONTH);
	}
	//day
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return Calendar.day_of_month value of event.Date
	 */
	public int getDay() {
		return eventDate.get(Calendar.DAY_OF_MONTH);
	}
	/**
	 * @return Calendar.hour value of event.Date
	 */
	public int getHour() {
		return eventDate.get(Calendar.HOUR);
	}
	/**
	 * @return Calendar.minute value of event.Date
	 */
	public int getMinute() {
		return eventDate.get(Calendar.MINUTE);
	}
	/**
	 * @return eventDate
	 */
	//event date
	public Calendar getEventDate() {
		return eventDate;
	}
	//simple date (just a day)
	public void setDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
		eventDate = Calendar.getInstance();
		eventDate.set(year, month, day);
	}
	//date with time
	public void setDate(int year, int month, int day, int hour, int minute) {
		setYear(year);
		setMonth(month);
		setDay(day);
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
	
	
	
}
