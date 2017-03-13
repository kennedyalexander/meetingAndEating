package com.meetAndEat.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meetAndEat.Repository.EventRepository;
import com.meetAndEat.models.Event;
import com.meetAndEat.models.UserInformation;


@Repository
public class EventDaoImpl implements EventDao{

	
	@Autowired
    private EventRepository repository;
	
	public void createEvent(Event event) {
		repository.save(event);
	}
	
	

	public List<Event> getEventsForUser(String username) {
		// TODO Auto-generated method stub
		return repository.findByHost(username);
	}

	public Event getEvents() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
