package com.meetAndEat.models;

public class User {
	String Username;
	String Password;
	
	public User(String username, String password) {
		Username = username;
		Password = password;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

}
