package com.meetAndEat.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meetAndEat.Repository.EventRepository;
import com.meetAndEat.models.Event;


@Repository
public class EventDaoImpl implements EventDao{

	
	@Autowired
    private EventRepository repository;
	
	public void createEvent(Event event) {
		repository.save(event);
	}
	
	public void updateEvent(Event event) {
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
	
	public Event activateEvent(String eventId) {
		if (repository.findById(eventId) != null){
			return repository.findById(eventId).get(0);
		} else{
			return new Event();
		}
	}
	
}
