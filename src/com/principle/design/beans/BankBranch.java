package com.principle.design.beans;

import java.util.List;

public class BankBranch {

	private String name;
	private List<Atm> atmList;

	public BankBranch(String name, List<Atm> atmList) {
		this.name = name;
		this.atmList = atmList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Atm> getAtmList() {
		return atmList;
	}

	public void setAtmList(List<Atm> atmList) {
		this.atmList = atmList;
	}

}
