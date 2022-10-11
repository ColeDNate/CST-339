package com.gcu.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.EventDataService;
import com.gcu.data.EventEntity;
import com.gcu.model.EventModel;

public class ScheduleService implements ScheduleServiceInterface {
	
	
	/*** VARIABLES ***/
	@Autowired
	private EventDataService service;
	//private List<EventModel> eventList;
	
	
	/*** METHODS ***/

	public List<EventModel> getEvents() {
		//get events
		List<EventEntity> eventsEntity = service.findAll();
		
		//iterate and create list
		List<EventModel> eventsDomain = new ArrayList<EventModel>();
		for(EventEntity entity: eventsEntity) {
			eventsDomain.add(new EventModel(entity.getId(),
											entity.getEventName(),
											entity.getEventYear(),
											entity.getEventMonth(),
											entity.getEventDay()));
		}
		//return list
		return eventsDomain;
	}
	
	//Add Event adds an event to the list of the events
	public void addEvent(String name, int year, int month, int day) {
		//eventList.add(new EventModel(name, year, month, day));
	}
	//add Event overload uses a name and calendar date
	public void addEvent(String name, Calendar date) {
		//eventList.add(new EventModel(name, date));
	}
	//test add
	public EventModel addEvent() {
		EventModel event = new EventModel("fake event", 1, 1, 1);
		//eventList.add(event);
		return event;
	}
	
	
	//Initializes the event list
	public void init() {
		
		/***
		//flavor text
		System.out.println("This is the init function");
		System.out.println("    Retrieving data...");
		
		//establishing new default event list
		eventList = new ArrayList<EventModel>();

		eventList.add(new EventModel("Event 1", 2023, 1, 1));
		eventList.add(new EventModel("Event 2", 2023, 2, 2));
		eventList.add(new EventModel("Event 3", 2023, 3, 3));
		eventList.add(new EventModel("Event 4", 2023, 4, 4));
		***/
	}
	
	//TODO: expand functionality of destroy
	public void destroy() {
		System.out.println("This is the destroy function");
	}

}
