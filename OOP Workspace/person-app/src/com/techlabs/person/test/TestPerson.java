package com.techlabs.person.test;

import com.techlab.person.GenderOptions;
import com.techlab.person.Person;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Kuntan", 21, 1.65, 100, GenderOptions.MALE);
		
//		double bmi = p1.calculateBMI();
//		System.out.println(bmi);
		Person p2 = new Person("Prasad", 23, 1.55, 65, GenderOptions.MALE);
		printDetails(p1);
		printDetails(p2);
		
//		String result = p1.getCatagory();
//		System.out.println(result);
		p1.eat();
		printDetails(p1);
	}

	private static void printDetails(Person p) {
		System.out.println("Name : "+ p.getName()+"\t Age : "+ p.getAge()+
					  "\t Height : "+ p.getHeight()+"\t Weight : "+ p.getWeight()+
					  "\t Gender : "+ p.getGender()+"\t BMI : "+ p.calculateBMI()+
					 "\t Results : "+ p.getCatagory());
	}
	
}
