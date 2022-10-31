package com.gcu.service;

import java.util.List;

import com.gcu.model.EventModel;

public interface ScheduleServiceInterface {

	/**
	 * creates a List of EventModel into a static getEvents()
	 * @return
	 */
	public List<EventModel> getEvents();
	/**
	 * creates a List of EventModel into a static getEvents()
	 * @return
	 */
	public EventModel addEvent();
	public void init();
	public void destroy();

}
