package com.App.entity;

public class Booking {
	private int booking_Id;
	private Location source;
	private Location destination;
	private int bill;
	private String userName;
	private String driverName;

	public Booking(Location source, Location destination, String userName, String driverName) {
		super();
		this.source = source;
		this.destination = destination;
		this.userName = userName;
		this.driverName = driverName;
	}

	public Location getSource() {
		return source;
	}

	public void setSource(Location source) {
		this.source = source;
	}

	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
