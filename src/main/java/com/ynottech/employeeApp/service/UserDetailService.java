package com.ynottech.employeeApp.service;

import java.time.LocalDate;
import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynottech.employeeApp.dto.UserRequestDto;
import com.ynottech.employeeApp.entity.UserDetailEntity;
import com.ynottech.employeeApp.repository.UserDetailRepo;

@Service
public class UserDetailService {
    @Autowired
       private UserDetailRepo userDetailRepo;
    public boolean loginValidate(UserRequestDto user ) {
    	Optional<UserDetailEntity> userEntityOptinal = userDetailRepo.findByName(user.getUserName());
    	if(userEntityOptinal.get().getPassword().equals(user.getPassword())){
    		UserDetailEntity userEntity = userEntityOptinal.get();
    		userEntity.setLast_login(LocalDate.now());
    		userDetailRepo.saveAndFlush(userEntity);
    		return true;
    	}
    	return false;
    		
    }
}