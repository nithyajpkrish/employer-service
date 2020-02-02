package com.ynottech.employeeApp.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ynottech.employeeApp.dto.LoginStatusDto;
import com.ynottech.employeeApp.dto.UserRequestDto;
import com.ynottech.employeeApp.service.UserDetailService;

@RestController
public class UserDetailController {
	 @Autowired
     private UserDetailService userDetailService;
	 
	 @PostMapping ("/login")
	 public LoginStatusDto   userLoginCheck(@RequestBody UserRequestDto user ) {
		boolean isSuccessfull = userDetailService.loginValidate (user);
			if(isSuccessfull) {
				return new LoginStatusDto(1, "Successfully logged in");
			}
		 
		 return new LoginStatusDto(0 , "Login failed") ;
	 }
}


