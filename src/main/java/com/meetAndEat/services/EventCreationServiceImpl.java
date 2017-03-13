package com.meetAndEat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.meetAndEat.dao.EventDaoImpl;
import com.meetAndEat.dao.UserDaoImpl;
import com.meetAndEat.models.Event;

@Service
public class EventCreationServiceImpl implements EventCreationService{

	@Autowired
	EventDaoImpl eventDaoImpl;
	
	public HttpStatus createEvent(Event event) {
		eventDaoImpl.createEvent(event);
		return HttpStatus.ACCEPTED;
	}
	
	public List<Event> getUsersEvents( String username) {
		
		return eventDaoImpl.getEventsForUser(username);
	}

	
}
