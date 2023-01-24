package com.example.demo.random.domain;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

public class Address {

	@Getter @Setter private String street;
	@Getter @Setter private String city;
	@Getter @Setter private String state;
	
	public Address () {
		Constant ct = new Constant();
		Random rand = new Random();
		this.street = ct.streets.get( rand.nextInt(ct.streets.size()) );
		this.city = ct.citys.get( rand.nextInt(ct.citys.size()) );
		this.state = ct.states.get( rand.nextInt(ct.states.size()) );
	}
	
}
