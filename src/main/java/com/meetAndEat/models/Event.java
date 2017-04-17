package com.meetAndEat.models;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	
	@Id
	public UUID id;
	
	public String eventName;
	public Date eventDate;
	public int minimumGuests;
	public int maximumGuests;
	public String location;
	public String host;
	public String food;
	public EventSatus eventStatus;
	
	
	public Event(){
		this.eventName = "";
		this.eventDate = new Date();
		this.minimumGuests = 0;
		this.minimumGuests = 0;
		this.location = "";
		this.host = "";
		this.food = "";
		this.eventStatus = EventSatus.INVALID;
	}


	public Event(UUID id, String eventName, Date eventDate, int minimumGuests, int maximumGuests, String location,
			String host, String food, EventSatus eventStatus) {
		this.id = id;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.minimumGuests = minimumGuests;
		this.maximumGuests = maximumGuests;
		this.location = location;
		this.host = host;
		this.food = food;
		this.eventStatus = eventStatus;
	}

	public Event(String eventName, Date eventDate, int minimumGuests, int maximumGuests, String location,
	             String host, String food, EventSatus eventStatus) {
		this.id = UUID.randomUUID();
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.minimumGuests = minimumGuests;
		this.maximumGuests = maximumGuests;
		this.location = location;
		this.host = host;
		this.food = food;
		this.eventStatus = eventStatus;
	}


	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}


	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}


	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}


	/**
	 * @return the minimumGuests
	 */
	public int getMinimumGuests() {
		return minimumGuests;
	}


	/**
	 * @return the maximumGuests
	 */
	public int getMaximumGuests() {
		return maximumGuests;
	}


	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}


	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}


	/**
	 * @return the eventStatus
	 */
	public EventSatus getEventStatus() {
		return eventStatus;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}


	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}


	/**
	 * @param minimumGuests the minimumGuests to set
	 */
	public void setMinimumGuests(int minimumGuests) {
		this.minimumGuests = minimumGuests;
	}


	/**
	 * @param maximumGuests the maximumGuests to set
	 */
	public void setMaximumGuests(int maximumGuests) {
		this.maximumGuests = maximumGuests;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}


	/**
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}


	/**
	 * @param eventStatus the eventStatus to set
	 */
	public void setEventStatus(EventSatus eventStatus) {
		this.eventStatus = eventStatus;
	}
	
	

	

}
