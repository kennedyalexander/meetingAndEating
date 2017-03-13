package com.meetAndEat.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EventDto {

	public String eventName;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date eventDate;
	
	public int minimumGuests;
	public int maximumGuests;
	public String location;
	public String food;
	
	public EventDto() {
	}
	
	public EventDto(String eventName, Date eventDate, int minimumGuests, int maximumGuests, String location,
			String food) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.minimumGuests = minimumGuests;
		this.maximumGuests = maximumGuests;
		this.location = location;
		this.food = food;
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
	 * @return the food
	 */
	public String getFood() {
		return food;
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
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}
	


}
