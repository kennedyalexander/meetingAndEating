package com.meetAndEat.dao;

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
//		Create Event
//		Create link between user and event.
//		CREATE TABLE MEETING_EVENTS (
//			    e_id int(11)  auto_increment primary key,
//			    e_name VARCHAR(25) NOT NULL,
//			    e_date DATE NOT NULL,
//			    e_location VARCHAR(25) NOT NULL);
//			    
//			    
//			CREATE TABLE USER_EVENT (
//			    ue_username VARCHAR(25) NOT NULL,
//			    ue_eventid int(11) NOT NULL,
//			    ue_userRank VARCHAR(25) NOT NULL,
//			    PRIMARY KEY (ue_username, ue_eventid),
//			    FOREIGN KEY (ue_username) REFERENCES USERS(u_username),
//			    FOREIGN KEY (ue_eventid) REFERENCES MEETING_EVENTS(e_id));
//			  
//			
	}

	public Event getEventsForUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public Event getEvents() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
