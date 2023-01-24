package com.example.demo.random.domain;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;

public class User {

	@Getter private String gender;
	@Getter private String name;
	@Getter private Address location;
	@Getter private Date registerDate;
	@Getter private Info info;
	
	public void generateUser() {
		generateGender();
		generateName();
		generateAddress();
		
		generateInfo();
	}	
	
	public void generateGender () {
		Gender gd = new Gender();
		gender = gd.getGender();
	}
	
	public void generateName() {
		Name na = new Name();
		name = na.getName();
	}
	
	public void generateAddress() {
		location = new Address();
	}
	
	public void generateInfo() {
		info = new Info();
		info.setSeed( UUID.randomUUID().toString() );
	}
}
