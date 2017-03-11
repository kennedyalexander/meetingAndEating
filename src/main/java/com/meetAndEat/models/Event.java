package com.meetAndEat.models;

import java.util.Date;

public class Event {
	
	String eventName;
	Date eventDate;
	int amountOfSpace;
	String location;
	
	public Event(){
		this.eventName = "";
		this.eventDate = new Date();
		this.amountOfSpace = 0;
		this.location = "";
	}
	
	public Event(String eventName, Date eventDate, int amountOfSpace, String location) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.amountOfSpace = amountOfSpace;
		this.location = location;
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
	 * @return the amountOfSpace
	 */
	public int getAmountOfSpace() {
		return amountOfSpace;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
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
	 * @param amountOfSpace the amountOfSpace to set
	 */
	public void setAmountOfSpace(int amountOfSpace) {
		this.amountOfSpace = amountOfSpace;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	

}
