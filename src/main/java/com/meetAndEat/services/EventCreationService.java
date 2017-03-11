package com.meetAndEat.services;

import org.springframework.http.HttpStatus;

import com.meetAndEat.models.Event;

public interface EventCreationService {
	
	public HttpStatus createEvent(Event event, String username);

}
