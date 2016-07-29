package com.principle.design.beans;

public class Atm {

	private int latitude;
	private int longitude;
	private int balanceAmount;

	public Atm(int latitude, int longitude, int balanceAmount) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.balanceAmount = balanceAmount;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

}
