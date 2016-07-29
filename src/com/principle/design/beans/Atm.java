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

	public int getLongitude() {
		return longitude;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}
	
	public void updateBalance(int amount)
	{
		this.balanceAmount = amount;
		if(amount <= 0)
		{
			System.out.println("Notify bank, low balance in atm");
		}
	}


}
