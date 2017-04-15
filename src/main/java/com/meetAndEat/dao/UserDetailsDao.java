package com.meetAndEat.dao;

import com.meetAndEat.models.User;
import com.meetAndEat.models.UserDetails;

/**
 * Created by alexander on 15/04/2017.
 */
public interface UserDetailsDao {

	UserDetails getUserDetails(User user);
	UserDetails createUserDetails(UserDetails userDetails);
	UserDetails updateUserDetails(UserDetails userDetails);
	UserDetails deleteUserDetails(User user);
}
