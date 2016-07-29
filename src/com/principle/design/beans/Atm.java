package com.principle.design.beans;

public class Atm {

	private Location data = new Location();
	private int balanceAmount;

	public Atm(int latitude, int longitude, int balanceAmount) {
		this.data.setLatitude(latitude);
		this.data.setLongitude(longitude);
		this.balanceAmount = balanceAmount;
	}

	public int getLatitude() {
		return data.getLatitude();
	}

	public int getLongitude() {
		return data.getLongitude();
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
