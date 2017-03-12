package com.meetAndEat.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meetAndEat.models.Event;

public interface EventRepository extends MongoRepository<Event, String>  {
	
	public List<Event> findByHost(String username);
	

}
