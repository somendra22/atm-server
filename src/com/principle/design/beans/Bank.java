package com.principle.design.beans;

import java.util.List;

public class Bank {

	private String name;
	private List<BankBranch> branches;

	public Bank(String name, List<BankBranch> branches) {
		this.name = name;
		this.branches = branches;
	}

	public String getName() {
		return name;
	}

	public List<BankBranch> getBranches() {
		return branches;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBranches(List<BankBranch> branches) {
		this.branches = branches;
	}

}
