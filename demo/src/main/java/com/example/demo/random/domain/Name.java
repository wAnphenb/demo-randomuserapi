package com.example.demo.random.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Name {

	private List<String> titles = new ArrayList<String>( Arrays.asList("Mr.", "Mrs.", "Ms.") );
	private List<String> firsts = new ArrayList<String>( Arrays.asList("Kathleen" ,"Joshua" ,"Matthew" ,"Joseph" ,"Judith" ,"Tonya" ,"Mark" ,"Patrick" ,"Jeremy" ,"Eric" ,"Charles" ,"Dana" ,"Jimmy" ,"Ashley" ,"Natalie" ,"Michael" ,"Daniel" ,"Jeremy" ,"Michael" ,"Brittany" ) );
	private List<String> lasts = new ArrayList<String>( Arrays.asList("Stafford","Thomas","White","Santos","Atkinson","Smith","Galvan","Pena","Barnes","Richardson","Wood","Chung","Palmer","Hernandez","Hardy","Campos","Wilson","Scott","Maddox","Miller") );
	
	public String getName() {
		Random rand = new Random();
		String title = titles.get( rand.nextInt(titles.size()) );
		String first = firsts.get( rand.nextInt(firsts.size()) );
		String last = lasts.get( rand.nextInt(lasts.size()) );
		
		return title + " " + first + " " + last; 
	}
}
