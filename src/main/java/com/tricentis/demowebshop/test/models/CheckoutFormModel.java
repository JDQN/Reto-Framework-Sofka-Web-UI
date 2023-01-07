package com.tricentis.demowebshop.test.models;

public class CheckoutFormModel {
	
	private String firstName;
	private String lastName;
	private String email;
	private String country;
	private String state;
	private String city;
	private String address;
	private String postalCode;
	private String phoneNumber;

	
	public CheckoutFormModel() {
	}
	
	public CheckoutFormModel(String firstName, String lastName, String email,
	                         String country, String state, String city,
	                         String address, String postalCode, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.country = country;
		this.state = state;
		this.city = city;
		this.address = address;
		this.postalCode = postalCode;
		this.phoneNumber = phoneNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "CheckoutFormModel{" +
				       "firstName='" + firstName + '\'' +
				       ", lastName='" + lastName + '\'' +
				       ", email='" + email + '\'' +
				       ", country='" + country + '\'' +
				       ", state='" + state + '\'' +
				       ", city='" + city + '\'' +
				       ", address='" + address + '\'' +
				       ", postalCode='" + postalCode + '\'' +
				       ", phoneNumber='" + phoneNumber + '\'' +
				       '}';
	}
}
