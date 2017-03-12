package com.meetAndEat.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meetAndEat.models.Event;
import com.meetAndEat.models.UserInformation;

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
				username = username.toLowerCase();
				
			
//		String statement = String.format("SELECT 'ue_eventid', 'ue_userPosition' FROM USER_EVENT WHERE ue_username = '%s'", username);
//		List<UserInformation> users = h2JdbcTemplate.query(statement, new RowMapper<UserInformation>() {
//			public UserInformation mapRow(ResultSet rs, int rowNum) throws SQLException {
//				UserInformation user = new UserInformation(
//						rs.getString("ue_eventid"), 
//						rs.getString("ue_userPosition"), 
//						rs.getString("ui_lastname"), 
//						rs.getString("ui_email"), 
//						rs.getDate("ui_dob"), 
//						rs.getString("ui_location"));
//				return user;
//			}
//		});
//		USER_EVENT
//		SELECT *
//		FROM MEETING_EVENTS
//		INNER JOIN USER_EVENT
//		ON USER_EVENT.e_uuid=MEETING_EVENTS.ue_eventid;
//		UserInformation returnedUser = new UserInformation();
//		if (users.isEmpty()){
//			return returnedUser;
//		}
//		return users.get(0);
	return null;
	}
	//	SELECT 
//		);
//		String statement = String.format("SELECT * FROM USER_INFORMATION WHERE ui_username = '%s'", username
//		statement = String.format(
//		"SELECT * FROM USER_INSERT INTO MEETING_EVENTS(e_uuid, e_name, e_date, e_guestSpace, e_location) VALUES ('%s', '%s', '%t', '%i', '%s');",
//		idOne.toString(),
//		event.getEventName(), 
//		event.getEventDate(),
//		event.getAmountOfSpace(),
//		SELECT b.id, l.libelle, p.libelle
//		  FROM FT_SEARCH_DATA(1, 0, 0) FT, ENREGISTREMENT b
//		   JOIN LIBELLE l on (b.id_libelle = l.id)
//		   JOIN MODEREGLEMENT p on (b.id_MODEREGLEMENT = p.id)
//		 WHERE b.id=FT.KEYS[0]
//		 AND FT.TABLE='ENREGISTREMENT' 
//		ORDER BY b.id;
//		event.getLocation());
		
		return null ;
	}

	public Event getEvents() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
