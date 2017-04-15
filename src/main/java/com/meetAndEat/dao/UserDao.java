package com.meetAndEat.dao;

import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;

public interface UserDao {

	User createUser(User user);
	UserDetails getUserInformation(String username);
	
}
