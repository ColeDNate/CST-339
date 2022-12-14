package com.gcu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.EventModel;
import com.gcu.*;
	


@RestController
@RequestMapping("/login/doLogin/service")
public class ScheduleRestService {

	/* TODO: function needs fixing
	 * 
	public @Autowired ScheduleServiceInterface schedule;
	
	@GetMapping(path = "/getjson", 
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<EventModel> getOrdersAsJson() {
		return schedule.events(null);
	}
	*/
	@GetMapping(path = "/getxml", produces = {MediaType.APPLICATION_XML_VALUE})
	//instructions show 'OrdersList' but this returns an error, so 'OrderList' was used.
	/**
	 * sets and returns a new base EventModel with name "null" and year/month/day of 0
	 * @return evMod
	 */
	public EventModel getOrdersAsXml() {
		EventModel evMod = new EventModel(null, 0, 0, 0);
		evMod.getEventDate();
		return evMod;
	}

}
