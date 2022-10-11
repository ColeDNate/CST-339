package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gcu.data.repository.EventsRepository;

@Service
public class EventDataService implements DataAccessInterface<EventEntity> {

	/*** VARIABLES ***/
	@Autowired
	private EventsRepository eventsRepository;
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	/*** CONSTRUCTORS ***/
	public EventDataService(EventsRepository ordersRepository, DataSource dataSource) {
		this.eventsRepository = ordersRepository;
		this.dataSource = dataSource;
		this.jdbcTemplateObject= new JdbcTemplate(dataSource);		
	}
	
	
	/*** INTERFACE METHODS ***/
	@Override
	public List<EventEntity> findAll() {
		List<EventEntity> events = new ArrayList<EventEntity>();
		
		try {
			//get all entity orders
			Iterable<EventEntity> eventsIterable = eventsRepository.findAll();
			
			//convert to a list
			events = new ArrayList<EventEntity>();
			eventsIterable.forEach(events::add);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return events;
	}

	@Override
	public EventEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(EventEntity event) {
		//inject a datSource and use the jdbcTemplate to provide customized implementation
		String sql = "INSERT INTO EVENTS(ID, EVENT_NAME, EVENT_YEAR, EVENT_MONTH) VALUES(?, ?, ?, ?, ?)";
		try {
			//execute SQL insert
			jdbcTemplateObject.update(sql,event.getId(),
										event.getEventName(),
										event.getEventYear(),
										event.getEventMonth(),
										event.getEventDay());
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(EventEntity event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(EventEntity event) {
		// TODO Auto-generated method stub
		return false;
	}

}
