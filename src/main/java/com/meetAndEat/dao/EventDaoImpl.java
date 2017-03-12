package com.meetAndEat.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meetAndEat.models.Event;

@Transactional
@Repository
public class EventDaoImpl implements EventDao{

	@Autowired
	private JdbcTemplate h2JdbcTemplate;
	
	public void createEvent(Event event, String username) {
		String statement = "";
		UUID idOne = UUID.randomUUID();
		statement = String.format(
		"INSERT INTO MEETING_EVENTS(e_uuid, e_name, e_date, e_guestSpace, e_location) VALUES ('%s', '%s', '%t', '%i', '%s');",
		idOne.toString(),
		event.getEventName(), 
		event.getEventDate(),
		event.getAmountOfSpace(),
		event.getLocation());
		
		//geteventID
		//getusername
		statement += String.format(
		"INSERT INTO USER_EVENT(ue_username, ue_eventid, ue_userPosition) VALUES ('%s', '%s', '%s');", 
		username.toLowerCase(), 
		idOne.toString(),
		"Creator");
		//MEETING_EVENTS
		//USER_EVENT
		h2JdbcTemplate.execute(statement);
		
	}

	public List<Event> getEventsForUser(String username) {
		// TODO Auto-generated method stub
		String statement = "";
//		
//		statement = String.format(
//		"SELECT * FROM USER_INSERT INTO MEETING_EVENTS(e_uuid, e_name, e_date, e_guestSpace, e_location) VALUES ('%s', '%s', '%t', '%i', '%s');",
//		idOne.toString(),
//		event.getEventName(), 
//		event.getEventDate(),
//		event.getAmountOfSpace(),
//		event.getLocation());
		
		return null ;
	}

	public Event getEvents() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
