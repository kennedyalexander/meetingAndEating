package com.meetAndEat.dao;

import java.util.List;

import com.meetAndEat.models.Event;

public interface EventDao {
	
	void createEvent(Event event);
	List<Event> getEventsForUser(String username);
}
