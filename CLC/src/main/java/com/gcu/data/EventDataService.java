package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.EventRepository;
import com.gcu.entity.EventEntity;

public class EventDataService implements DataAccessInterface<EventEntity> {

	@Autowired
	private EventRepository eventRepo;
	private EventEntity ent;
	
	public EventDataService(EventRepository eventRepo) {
		this.eventRepo = eventRepo;
	}
	
	/**
	 * finds the events - I think. 
	 */
	
	@Override
	public List<EventEntity> findAll() {
		List<EventEntity> schedule = new ArrayList<EventEntity>();
		try {
			Iterable<EventEntity> eventIt = eventRepo.findAll();
			schedule = new ArrayList<EventEntity>();
			eventIt.forEach(schedule::add);
		}
		
		catch (Exception ex) {
			System.out.println("something went wrong in data.EDS.findAll");
			ex.printStackTrace();
		}
		return schedule;
	}
	/**
	 * Makes the events
	 */
	@Override
	public boolean create(EventEntity event) {
		try {
			this.eventRepo.save(event);
		}
		
		catch (Exception ex) {
			System.out.println("Something went wrong in data.EDS.create");
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Updates the events
	 */
	@Override
	public boolean update(EventEntity event) {
		
		try {
			this.eventRepo.insert("id=%s, name='%s', year='%s', month='%s', "
				+ "day='%s', hour='%s', minute='%s'", ent.id, ent.name, ent.year, ent.month, ent.day, ent.hour, ent.minute);
		}
		
		catch (Exception ex) {
			System.out.println("Something went wrong in data.EDS.update");
			ex.printStackTrace();
			return false;
		}
		return true;
	}
	/**
	 * Deletes an event
	 */
	@Override
	public boolean delete(EventEntity event) {
		try {
			this.eventRepo.delete(event);
		}
		
		catch (Exception ex) {
			System.out.println("Something went wrong in data.EDS.delete");
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public EventEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
