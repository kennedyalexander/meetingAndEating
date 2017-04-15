package com.meetAndEat.services;

import org.springframework.http.HttpStatus;

import com.meetAndEat.models.Event;

public interface EventManagementService {
	
	HttpStatus createEvent(Event event);

}
