package com.meetAndEat.dao;

import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;
import org.springframework.http.HttpStatus;

public interface UserDetailsDao {

	HttpStatus createUserDetails(UserDetails userDetails);
	UserDetails getUserDetails(String username);
	HttpStatus updateUserDetails(UserDetails userDetails);
	HttpStatus deleteUserDetails(String user);

	
}
