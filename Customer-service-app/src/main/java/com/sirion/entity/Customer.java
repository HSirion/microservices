package com.sirion.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddress(String addressId) {
		this.addressId = addressId;
	}
	
	@Id
	@Size(min=5, message="Id should have atleast 5 characters")
	private String customerId;
	  
	@NotNull(message ="first Name should not be null")
	@Size(min=3, message="first name should have atleast 3 characters")
	private String firstName;
	
	@NotNull(message ="Last Name should not be null")
	@Size(min=3, message="last name should have atleast 3 characters")
	private String lastName;
	
	@NotNull
	@Size(min=10, message="phone should have atleast 10 numbers")
	@Pattern(regexp="(^$|[0-9])",  message = "Mobile number should contain only numbers")
	private String mobileNumber;
	
	@Email(message ="Invalid Email")
	private String email;
	
	@NotNull
	private String addressId;
	public Customer(String customerId, String firstName, String lastName, String mobileNumber, String email,
			String addressId) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addressId = addressId;
	}
	public Customer() {
		
	}
	
	
}