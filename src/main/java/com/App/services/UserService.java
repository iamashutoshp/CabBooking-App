package com.App.services;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.App.entity.User;
import com.App.entity.Location;

@Service
public class UserService {
	private static final Logger logger = LogManager.getLogger(UserService.class);
	
	private Map<String, User> users;

	public UserService() {
		users = new HashMap<>();
	}

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		try {
			users.put(user.getUserName(), user);
			logger.info("user added : "+user.getUserName());
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}
	}

	public void updateUserLocation(User user, Location location) {
		try {
			user.setLocation(location);
			logger.info(" Location updated for : "+user.getUserName());
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}
	}
}
