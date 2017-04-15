package com.meetAndEat.services;

import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;
import org.springframework.http.HttpStatus;

/**
 * Created by alexander on 15/04/2017.
 */
public interface UserDetailsManagementService {

	HttpStatus createUserDetails(UserDetails userDetails);
	HttpStatus updateUserDetails(UserDetails userDetails);
	HttpStatus deleteUserDetails(User user);
	HttpStatus getUserDetails(User user);
}
