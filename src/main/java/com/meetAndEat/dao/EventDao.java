package com.meetAndEat.dao;

import java.util.List;

import com.meetAndEat.models.Event;

public interface EventDao {
	
	public void createEvent(Event event);
	public List<Event> getEventsForUser(String username);
}
