package com;

public class AccountHolder {

	
	private String name;
	private String gender;
	private String dob;
	
	public AccountHolder() {
		// TODO Auto-generated constructor stub
	}

	public AccountHolder(String name, String gender, String dob) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
