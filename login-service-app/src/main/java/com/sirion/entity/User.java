package com.sirion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "User_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$",
			message = "password should have altleast one digit, one lowercase character, one uppercase character, "
					+ "one special character and length should be between 8 to 32 characters")
	private String password;
	
	public User() {
		
	}
	public User(String userId, String password,
			@NotNull @Size(min = 5, message = "Role should have atleast 5 characters") String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}
	@NotNull
	@Size(min=5, message="Role should have atleast 5 characters")
	@Column(name="user_role")
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
