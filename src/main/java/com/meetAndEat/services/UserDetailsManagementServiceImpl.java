package com.meetAndEat.services;

import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Created by alexander on 15/04/2017.
 */
@Service
public class UserDetailsManagementServiceImpl implements UserDetailsManagementService {
	@Override
	public HttpStatus createUserDetails(UserDetails userDetails) {
		return null;
	}

	@Override
	public HttpStatus updateUserDetails(UserDetails userDetails) {
		return null;
	}

	@Override
	public HttpStatus deleteUserDetails(User user) {
		return null;
	}

	@Override
	public HttpStatus getUserDetails(User user) {
		return null;
	}
}
