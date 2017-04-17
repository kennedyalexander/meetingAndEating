package com.meetAndEat.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meetAndEat.models.Event;

public interface EventRepository extends MongoRepository<Event, String>  {
	
	List<Event> findByHost(String username);
	
	List<Event> findById(UUID eventId);
	
	
	
	
}
