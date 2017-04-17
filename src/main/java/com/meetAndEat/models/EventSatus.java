package com.meetAndEat.models;

/**
 * Different event statuses
 * 
 * @author alexander
 *
 */
public enum EventSatus {
	/**
	 * Looking for Guests
	 */
	SEARCHING, 
	/**
	 * Minimum guests found we can now start to plan
	 */
	CONFIRMED, 
	/**
	 * All guests found. Going ahead and event page created.
	 */
	IMMINENT, 
	/**
	 * Any event can be cancelled at any point.
	 */
	CANCELLED, 
	/**
	 * Event Created but still not activated by the user.
	 */
	PENDING,
	/**
	 * Any event as it is initally created.
	 */
	INVALID
}
