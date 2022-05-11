package com.App.entity;

public class Ride {
	private String modelName;
	private String serialNo;

	public Ride(String modelName, String serialNo) {
		super();
		this.modelName = modelName;
		this.serialNo = serialNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Override
	public String toString() {
		return "Ride [modelName=" + modelName + ", serialNo=" + serialNo + "]";
	}

}
