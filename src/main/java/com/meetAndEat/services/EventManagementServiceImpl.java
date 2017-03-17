package com.meetAndEat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.meetAndEat.dao.EventDaoImpl;
import com.meetAndEat.dao.UserDaoImpl;
import com.meetAndEat.models.Event;
import com.meetAndEat.models.EventSatus;

@Service
public class EventManagementServiceImpl implements EventManagementService{

	@Autowired
	EventDaoImpl eventDaoImpl;
	
	public HttpStatus createEvent(Event event) {
		eventDaoImpl.createEvent(event);
		return HttpStatus.ACCEPTED;
	}
	
	public List<Event> getUsersEvents( String username) {
		
		return eventDaoImpl.getEventsForUser(username);
	}
	
	public  HttpStatus ActivateEvent(String event) {
		Event activateMe = eventDaoImpl.activateEvent(event);
		activateMe.setEventStatus(EventSatus.SEARCHING);
		eventDaoImpl.updateEvent(activateMe);
		return HttpStatus.ACCEPTED;
	}

	
}
