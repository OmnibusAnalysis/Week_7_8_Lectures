package com.coderscampus.lesson7;

public class RegExApplication {

	
	public static void main(String[] args)  {
		
		//a regrex or regular expression is a pattern matching functionality 
		//can be used in real time or not for validating things like the structure of an email address. 
		
		String input = "fake.email@gmail.com";
		boolean matchFound = input.matches("[a-z]+.?[a-z]+@[a-z]+.[a-z]{1,5}"); 

		
     //[a-z]+.?[a-z]+@[a-7+.[a-z]{1,5} stands for 
//		[a-7+ the plus means one or more charactrers in the range of a to z
//		 the . signals a new instance
//		 [a-
			
	
		
		 
		
		System.out.println("match found");
		
	}
	
}

