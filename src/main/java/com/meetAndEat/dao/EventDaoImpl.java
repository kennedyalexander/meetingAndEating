package com.meetAndEat.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.meetAndEat.Repository.EventRepository;
import com.meetAndEat.models.Event;


@Repository
public class EventDaoImpl implements EventDao{

	
	@Autowired
    private EventRepository repository;
	
	public HttpStatus createEvent(Event event) {
		repository.save(event);
		return HttpStatus.OK;
	}
	
	public void updateEvent(Event event) {
		repository.save(event);
	}
	
	public List<Event> getEventsForUser(String username) {
		return repository.findByHost(username);
	}

	public List<Event> getEvents() {
		return repository.findAll();
	}
	
	public Event getEvent(UUID eventId) {
		if (repository.findById(eventId) != null){
			return repository.findById(eventId).get(0);
		} else{
			return new Event();
		}
	}
	
}
