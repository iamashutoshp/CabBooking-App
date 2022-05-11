package com.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.App.entity.Driver;
import com.App.entity.Location;
import com.App.entity.Ride;
import com.App.entity.User;
import com.App.services.BookingService;
import com.App.services.DriverService;
import com.App.services.UserService;
@Component
public class ExecuteTest {
	private static final Logger logger = LogManager.getLogger(ExecuteTest.class);
	
	@Autowired
	private UserService userService;

	@Autowired
	private DriverService driverService;
	
	@Autowired
	private BookingService bookingService;

	public void addUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("Abhishek", 'M', 23));
		users.add(new User("Rahul", 'M', 29));
		users.add(new User("Nandini", 'F', 22));

		for (User user : users)
			userService.addUser(user);
	}

	public void updateUsersLocation() {
		Map<String, User> users = userService.getUsers();

		for (Map.Entry entry : users.entrySet()) {
			userService.updateUserLocation((User) entry.getValue(), new Location(0, 0));
		}
	}

	public void addDrivers() {
		List<Driver> drivers = new ArrayList<Driver>();
		drivers.add(new Driver("Driver1", 'M', 22, new Ride("Swift", "KA-01-12345"), new Location(10, 1)));
		drivers.add(new Driver("Driver2", 'M', 29, new Ride("Swift", "KA-01-12346"), new Location(11, 10)));
		drivers.add(new Driver("Driver3", 'M', 24, new Ride("Swift", "KA-01-12347"), new Location(5, 3)));

		for (Driver driver : drivers) {
			driverService.addDriver(driver);
		}
	}

	public void findRide() {
		User user = userService.getUsers().get("Abhishek");

		List<Driver> drivers=bookingService.findRide(user, new Location(0, 0), new Location(20, 1));
		if(drivers.size()>0) {
			bookingService.chooseRide(user, drivers.get(0), new Location(0, 0), new Location(20, 1));
		}else {
			logger.info(user.getUserName() + ": No Rides found !");
		}
		
		user = userService.getUsers().get("Rahul");
		drivers=bookingService.findRide(user, new Location(10, 0), new Location(15, 3));
		if(drivers.size()>0) {
			bookingService.chooseRide(user, drivers.get(0), new Location(10, 0), new Location(15, 3));
		}else {
			logger.info(user.getUserName() + ": No Rides found !");
		}
		
		user = userService.getUsers().get("Nandini");
		drivers=bookingService.findRide(user, new Location(15, 6), new Location(20, 4));
		if(drivers.size()>0) {
			bookingService.chooseRide(user, drivers.get(0), new Location(15, 6), new Location(20, 4));
		}else {
			logger.info(user.getUserName() + ": No Rides found !");
		}
	}
}
