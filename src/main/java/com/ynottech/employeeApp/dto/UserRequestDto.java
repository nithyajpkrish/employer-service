package com.ynottech.employeeApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequestDto {
	
     @JsonProperty("user_name")	
     private String userName;
     
     private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
}
