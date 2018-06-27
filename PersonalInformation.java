package com.techaxis.resturantmanagement.people;

public class PersonalInformation {
	
	public PersonalInformation(){
	
	}
	private String name;
	private String emailId;
	private String phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "PersonalInformation [name=" + name + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
