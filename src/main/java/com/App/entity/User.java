package com.App.entity;

import com.App.entity.Ride;

public class User {
	private String userId;
	private String userName;
	private char gender;
	private int age;
	private Location location;
	
	@Override
	public String toString() {
		return "User { userId=" + userId + ", userName=" + userName + ", gender=" + gender + ", age=" + age
				+ ", location=" + location + " } ";
	}

	public User(String userName, char gender, int age) {
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.userId=userName+"_"+gender+"_"+age;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
