package com.gcu;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.gcu.model.EventModel;
import com.gcu.model.LoginModel;

public interface ScheduleInterface {

	public default List<EventModel> events(Model model) {
		
		
		//create some orders
		List<EventModel> events = new ArrayList<EventModel>();
		events.add(new EventModel("Event 1", 2023, 1, 1));
		events.add(new EventModel("Event 2", 2023, 2, 2));
		events.add(new EventModel("Event 3", 2023, 3, 3));
		events.add(new EventModel("Event 4", 2023, 4, 4));

		model.addAttribute("My Events", "EventModel");
		model.addAttribute("events", events);
		
		
		return (events);
		
	}

}
