package com.meetAndEat.dao;

import java.util.List;

import com.meetAndEat.models.Event;
import org.springframework.http.HttpStatus;

public interface EventDao {
	
	HttpStatus createEvent(Event event);
	List<Event> getEventsForUser(String username);
}
