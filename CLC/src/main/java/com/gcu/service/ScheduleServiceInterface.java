package com.gcu.service;

import java.util.List;

import com.gcu.model.EventModel;

public interface ScheduleServiceInterface {

	public List<EventModel> getEvents();
	public EventModel addEvent();
	public EventModel addEvent(EventModel eventModel);
	public void init();
	public void destroy();

}
