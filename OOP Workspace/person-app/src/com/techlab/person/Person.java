package com.techlab.person;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private GenderOptions gender;
	private double bmi;
	
	public Person(String name, int age, double heigth, double weigth, GenderOptions gender)
	{
		this.name=name;
		this.age=age;
		this.height=heigth;
		this.weight=weigth;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public GenderOptions getGender() {
		return gender;
	}
	public void workout()
	{
		weight=weight-(300/weight);
	}
	public void eat()
	{
		weight=weight+(300/weight);
		height=height+(200/height);
	}
	public double calculateBMI()
	{
		this.bmi = weight/(height*height);
		return bmi;
	}

	public String getCatagory() {
		double bmi=this.calculateBMI();
		if(bmi<18.5)
		{
			return "Underweight";
		}
		if(bmi<24.9 & bmi>=18.5)
		{
			return "Normal";
		}
		if(bmi<29.9 & bmi>=24.9)
		{
			return "Overweight";
		}
		return "Obese";
	}
}
