package com.coderscampus.lesson5;

import java.util.Arrays;
import java.util.Comparator;

public class SortingApplication {

	public static void main (String[] args) {
		String[] names = new String[4];
		
		names[0] = "Casey Michael";
		names[1] = "Dawn";
		names[2] = "Guy on the roof";
		names[3] = "Guy on the couch";
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("------");
		
		Arrays.sort(names);
		System.out.println("post- sorting");
		for (String name : names) {
			System.out.println(name);
		}
		
		
//		names[0] = "Josh Allen";
//		names[1] = "Casey Michael";
//		names[2] = "AJ Spitore";		
//		names[3] = "Spud Pug";
//		
//		System.out.println("Pre-Sorting");
//		
//		for (String name : names) {
//			System.out.println(name);
//		}
//	
//		System.out.println("------");
//		
//		Arrays.sort(names);
//		System.out.println("Post-Sorting");
//		
//		for (String name : names) {
//		System.out.println(name);
//	}
//
//		Person[] people = new Person[5];
//		
//		people[0] = new Person("Josh Allen", 72);
//		people[1] = new Person("Casey Michael", 69);
//		people[2] = new Person("AJ Spitore", 55);
//		people[3] = new Person("Spud Pug", 9);
//  		people[4] = new Person("Jane Doe", 67);
//  		
//		Arrays.sort(people);
//		System.out.println("----");
//		
//		for (Person person : people) {
//			System.out.println(person.getName());
//		}
//	
//		Arrays.sort(people, new PersonHeightComparator()); 
//		
//	}

//			public int compare(Person person1, Person person2) {
//				return person1.getHeight().compareTo(person2.getHeight());
//				return 0;
//			} 

//			@Override
//			public int compare(Person person1, Person person2) {
//				return person1.getHeight().compareTo(person2.getHeight());
//				return 0;
//			}
//			
//		});
//		for (Person person : people) {
//			System.out.println(person.getName() + " is " + person.getHeight() + "inches tall.");
//	}
//	
	
}
	
}
