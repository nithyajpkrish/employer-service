package com.ynottech.employeeApp.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_detail")
public class UserDetailEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="employee_seq_gen")
    @Column (name = "id", unique=true, nullable=false)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "created_on")
	private Date created_on;
	
	@Column(name = "last_login")
	private LocalDate last_login;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public LocalDate getLast_login() {
		return last_login;
	}
	public void setLast_login(LocalDate last_login) {
		this.last_login = last_login;
	}
   

}
