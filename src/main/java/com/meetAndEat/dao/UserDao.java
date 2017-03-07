package com.meetAndEat.dao;

import com.meetAndEat.models.User;
import com.meetAndEat.models.UserInformation;

public interface UserDao {

	public User createUser(User user);
	public UserInformation getUserInformation(String username);
	
}
