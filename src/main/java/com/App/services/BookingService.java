package com.App.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.App.entity.Booking;
import com.App.entity.Driver;
import com.App.entity.Location;
import com.App.entity.User;
import com.App.helper.Helper;

@Service
public class BookingService {
	private static final Logger logger = LogManager.getLogger(BookingService.class);

	@Autowired
	private DriverService driverService;
	@Autowired
	private Helper helper;

	private Map<String, Booking> bookings;

	public BookingService() {
		bookings = new HashMap<>();
	}

	public Map<String, Booking> getBookings() {
		return bookings;
	}

	public List<Driver> findRide(User user, Location source, Location destination) {
		List<Driver> availableDrivers = new ArrayList<Driver>();

		try {
			Map<String, Driver> allDrivers = driverService.getDrivers();

			for (Map.Entry entry : allDrivers.entrySet()) {
				Driver driver = (Driver) entry.getValue();
				int distance = helper.getDistance(source, driver.getLocation());
				if (driver.isAvailable() && distance < 5)
					availableDrivers.add(driver);
			}
			if (availableDrivers.size() > 0)
				logger.info(user.getUserName() + " : Rides found : " + availableDrivers);
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}

		return availableDrivers;
	}

	public boolean chooseRide(User user, Driver driver, Location source, Location destination) {
		try {
			if (!driver.isAvailable())
				return false;
			driver.setAvailable(false);
			bookings.put(user.getUserName(), new Booking(source, destination, user.getUserName(), driver.getName()));

			calculateBill(user);
			return true;
		} catch (Exception e) {
			logger.error(e.getStackTrace());
			return false;
		}
	}

	public int calculateBill(User user) {
		Booking booking = bookings.get(user.getUserName());

		int bill = 0;

		try {
			bill = helper.getDistance(booking.getSource(), booking.getDestination());
			Map<String, Driver> drivers = driverService.getDrivers();

			Driver driver = drivers.get(booking.getDriverName());
			driver.setLocation(booking.getDestination());
			user.setLocation(booking.getDestination());
			booking.setBill(bill);
			logger.info("Bill generated : " + bill);
			driver.setEarnings(bill + driver.getEarnings());

			return bill;
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}

		return bill;
	}

}
