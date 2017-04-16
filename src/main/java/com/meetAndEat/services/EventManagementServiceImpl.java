package com.meetAndEat.services;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.meetAndEat.dao.EventDaoImpl;
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

	@Override
	public Event getEvent(String eventId) {
		return null;
	}

	@Override
	public HttpStatus updateEvent(Event event) {
		return null;
	}

	@Override
	public HttpStatus deleteEvent(String eventId) {
		return null;
	}

	@Override
	public List<Event> getEvents() {
		return eventDaoImpl.getEvents();
	}
//	String id, String eventName, Date eventDate, int minimumGuests, int maximumGuests, String location,
//	String host, String food, EventSatus eventStatus)
	public HttpStatus makeEvent(String user){
		Event sampleEvent = new Event("Sample Event",
				Date.from(Instant.EPOCH),
				1,
				5,
				"OrangesOranges",
				user,
				"This is food",
				EventSatus.PENDING);
		return eventDaoImpl.createEvent(sampleEvent);
	}

	public List<Event> getUsersEvents( String username) {
		
		return eventDaoImpl.getEventsForUser(username);
	}
	
	public  HttpStatus activateEvent(String event) {
		Event activateMe = eventDaoImpl.activateEvent(event);
		activateMe.setEventStatus(EventSatus.SEARCHING);
		eventDaoImpl.updateEvent(activateMe);
		return HttpStatus.ACCEPTED;
	}

	
}
