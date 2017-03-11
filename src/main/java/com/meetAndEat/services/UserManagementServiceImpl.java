package com.meetAndEat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import com.meetAndEat.dao.UserDaoImpl;
import com.meetAndEat.models.Event;
import com.meetAndEat.models.User;
import com.meetAndEat.models.UserInformation;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	

		@Autowired
		UserDaoImpl userDaoImpl;
		
		
		
		public HttpStatus createUser(User user) {
			userDaoImpl.createUser(user);
			return HttpStatus.ACCEPTED;
		}
		
		public UserInformation getUserInformation(String user){
			return userDaoImpl.getUserInformation(user);
		}

		
	}

