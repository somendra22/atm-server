package com.principle.design.beans;

public class Bank {

	private String name;
	private BankBranch branch;

	public Bank(String name, BankBranch branches) {
		this.name = name;
		this.branch = branches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankBranch getBranch() {
		return branch;
	}

	public void setBranch(BankBranch branch) {
		this.branch = branch;
	}
	
}
