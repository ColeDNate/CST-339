package com.gcu.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("EVENTS")
public class EventEntity {
	
	/*** VARIABLES ***/
	@Id
	private long id;
	
	@Column("EVENT_NAME")
	private String eventName;
	
	@Column("EVENT_YEAR")
	private int eventYear;
	
	@Column("EVENT_MONTH")
	private int eventMonth;
	
	@Column("EVENT_DAY")
	private int eventDay;
	
	
	/*** CONSTRUCTORS ***/
	//default
	public EventEntity() {
		setId(0L);
		setEventName("some event");
		setEventYear(2022);
		setEventMonth(1);
		setEventDay(1);
	}
	//full
	public EventEntity(Long id, String eventName, int eventYear, int eventMonth, int eventDay) {
		setId(id);
		setEventName(eventName);
		setEventYear(eventYear);
		setEventMonth(eventMonth);
		setEventDay(eventDay);
	}
	
	
	/*** ACCESSORS AND MUTATORS ***/
	//id
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	//event name
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventName() {
		return eventName;
	}
	//event year
	public void setEventYear(int eventYear) {
		this.eventYear = eventYear;
	}
	public int getEventYear() {
		return eventYear;
	}
	//event month
	public void setEventMonth(int eventMonth) {
		this.eventMonth = eventMonth;
	}
	public int getEventMonth() {
		return eventMonth;
	}
	//event day
	public void setEventDay(int eventDay) {
		this.eventDay = eventDay;
	}
	public int getEventDay() {
		return eventDay;
	}
	

}
