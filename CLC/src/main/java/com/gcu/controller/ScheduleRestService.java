package com.gcu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.ScheduleInterface;
import com.gcu.model.EventModel;
import com.gcu.*;
	


@RestController
@RequestMapping("/login/doLogin/service")
public class ScheduleRestService {

	public @Autowired ScheduleInterface schedule;
	@GetMapping(path = "/getjson", 
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<EventModel> getOrdersAsJson() {
		return schedule.events(null);
	}
	
	@GetMapping(path = "/getxml", produces = {MediaType.APPLICATION_XML_VALUE})
	//instructions show 'OrdersList' but this returns an error, so 'OrderList' was used.
	public EventModel getOrdersAsXml() {
		EventModel evMod = new EventModel(null, 0, 0, 0);
		evMod.getEventDate();
		return evMod;
	}

}
