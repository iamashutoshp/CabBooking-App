package com.App.entity;

import com.App.entity.Ride;
import com.App.entity.Location;

public class Driver {
	private String name;
	private char gender;
	private int age;
	private boolean isAvailable;
	private Ride ride;
	private Location location;

	public Driver(String name, char gender, int age, Ride ride, Location location) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.ride = ride;
		this.location = location;
		isAvailable = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ride getRide() {
		return ride;
	}

	public void setRide(Ride ride) {
		this.ride = ride;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", gender=" + gender + ", age=" + age + ", ride=" + ride + ", location="
				+ location + "]";
	}

}
