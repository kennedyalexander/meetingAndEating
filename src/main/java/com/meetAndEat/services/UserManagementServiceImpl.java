package com.meetAndEat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import com.meetAndEat.dao.UserDetailsDaoImpl;
import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	

		@Autowired
		UserDetailsDaoImpl userDaoImpl;
		
		
		
		public HttpStatus createUser(User user) {
			userDaoImpl.createUserDetails(user);
			return HttpStatus.ACCEPTED;
		}
		
		public UserDetails getUserInformation(String user){
			return userDaoImpl.getUserDetails(user);
		}

		
	}

