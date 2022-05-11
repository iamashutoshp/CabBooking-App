package com.App.services;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.App.entity.Driver;
import com.App.entity.Location;

@Component
public class DriverService {
	private static final Logger logger = LogManager.getLogger(DriverService.class);

	private Map<String, Driver> drivers;

	public DriverService(Map<String, Driver> drivers) {
		this.drivers = drivers;
	}

	public Map<String, Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(Map<String, Driver> drivers) {
		this.drivers = drivers;
	}

	public void addDriver(Driver driver) {
		try {
			drivers.put(driver.getName(), driver);
			logger.info("driver : [" + driver.getName() + "] added ...");
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}
	}

	public void updateDriverLocation(Driver driver, Location location) {
		try {
			driver.setLocation(location);
			logger.info("Location Updated for Driver : "+driver.getName());
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}
	}

	public void changeDriverStatus(String driverName, boolean status) {
		try {
			Driver driver = drivers.get(driverName);
			driver.setAvailable(status);
			logger.info("Status updated for : "+driverName);
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}
	}
}
