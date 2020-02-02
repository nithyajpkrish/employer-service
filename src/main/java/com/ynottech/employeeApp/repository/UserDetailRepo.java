package com.ynottech.employeeApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ynottech.employeeApp.entity.UserDetailEntity;

@Repository
public interface UserDetailRepo extends JpaRepository<UserDetailEntity, Integer> {
   Optional<UserDetailEntity> findByName(String name);
}
