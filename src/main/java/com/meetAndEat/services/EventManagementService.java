package com.meetAndEat.services;

import org.springframework.http.HttpStatus;

import com.meetAndEat.models.Event;

import java.util.ArrayList;
import java.util.List;

public interface EventManagementService {
	
	HttpStatus createEvent(Event event);

	Event getEvent(String eventId);

	HttpStatus updateEvent(Event event);

	HttpStatus deleteEvent(String eventId);

	List<Event> getEvents();
}
