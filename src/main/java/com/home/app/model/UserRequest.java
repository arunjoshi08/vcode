package com.home.app.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserRequest", description = "Request model for user")
public class UserRequest {
	@ApiModelProperty(value = "username")
	String username;
	@ApiModelProperty(value = "password")
	String password;
	@ApiModelProperty(value = "email")
	String email;
	@ApiModelProperty(value = "phonenumber")
	String phoneNumber;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
