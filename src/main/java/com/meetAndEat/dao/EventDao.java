package com.meetAndEat.dao;

import com.meetAndEat.models.Event;

public interface EventDao {
	
	public void createEvent(Event event, String username);
	public Event getEventsForUser(String username);
}
