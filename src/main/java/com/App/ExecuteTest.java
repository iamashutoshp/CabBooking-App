package com.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.App.entity.Driver;
import com.App.entity.Location;
import com.App.entity.User;
import com.App.services.UserService;

@Component
public class ExecuteTest {
	
	@Autowired
	private UserService userService;
	
	public void addUsers() {
		List<User> users=new ArrayList<User>();
		users.add(new User("Abhishek", 'M', 23));
		users.add(new User("Rahul", 'M', 29));
		users.add(new User("Nandini", 'F', 22));
		
		for(User user : users)
			userService.addUser(user);
	}
	
	public void updateUsersLocation() {
		Map<String,User> users=userService.getUsers();
		
		for(Map.Entry entry : users.entrySet()) {
			userService.updateUserLocation((User)entry.getValue(), new Location(0, 0));
		}
	}
	
	public void addDrivers() {
		List<Driver> drivers=new ArrayList<Driver>();
	}
}
