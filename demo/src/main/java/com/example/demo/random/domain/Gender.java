package com.example.demo.random.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Gender {

	private List<String> genders = new ArrayList<String>( Arrays.asList("female", "male") );
	
	public String getGender() {
		Random rand = new Random();
		return genders.get( rand.nextInt(genders.size()) );
	}
}
