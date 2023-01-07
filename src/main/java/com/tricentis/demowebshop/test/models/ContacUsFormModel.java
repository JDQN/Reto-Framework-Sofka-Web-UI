package com.tricentis.demowebshop.test.models;


public class ContacUsFormModel {
	
	private String firstName;
	private String email;
	private  String enquiry;
	
	public ContacUsFormModel() {
	}
	
	public ContacUsFormModel(String firstName, String email, String enquiry) {
		this.firstName = firstName;
		this.email = email;
		this.enquiry = enquiry;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEnquiry() {
		return enquiry;
	}
	
	public void setEnquiry(String enquiry) {
		this.enquiry = enquiry;
	}
}
