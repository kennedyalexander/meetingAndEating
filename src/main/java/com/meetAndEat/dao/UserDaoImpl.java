package com.meetAndEat.dao;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meetAndEat.models.User;
import com.meetAndEat.models.UserInformation;

@Transactional
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private JdbcTemplate h2JdbcTemplate;

	/**
	 * Everytime you pass a emailaddresss it get converted to lowercase.
	 */
	public UserInformation getUserInformation(String username) {
		username = username.toLowerCase();
		String statement = String.format("SELECT * FROM USER_INFORMATION WHERE ui_username = '%s'", username);
		List<UserInformation> users = h2JdbcTemplate.query(statement, new RowMapper<UserInformation>() {
			public UserInformation mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserInformation user = new UserInformation(
						rs.getString("ui_username"), 
						rs.getString("ui_firstname"), 
						rs.getString("ui_lastname"), 
						rs.getString("ui_email"), 
						rs.getDate("ui_dob"), 
						rs.getString("ui_location"));
				return user;
			}
		});
		UserInformation returnedUser = new UserInformation();
		if (users.isEmpty()){
			return returnedUser;
		}
		return users.get(0);
	}
	
	public User createUser(User user) {
			String statement = "";
			statement = String.format("INSERT INTO USERS VALUES ('%s', '%s', 1);"
					+ "INSERT INTO USER_ROLES(r_username, r_role) VALUES ('%s', 'ROLE_USER');", user.getUsername().toLowerCase(), user.getPassword(), user.getUsername().toLowerCase());
			
			
			h2JdbcTemplate.execute(statement);
			return user;
		}

	}

