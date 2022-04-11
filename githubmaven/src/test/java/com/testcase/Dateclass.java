package com.testcase;

import java.util.Date;

public class Dateclass {

public static void main(String[] args) {
		
		
		Date d=new Date();
		
		//System.out.println(d);
		
		String cureentdate=d.toString().replace(" ", "-").replace(" ", ":");
		
		System.out.println(cureentdate);
		

	}

	
	
	
	
	
	
	
	
}
