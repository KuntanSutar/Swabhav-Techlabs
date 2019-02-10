package com.techlab.composite.pattern.test;
import com.techlab.composite.pattern.Employee;

public class TestFolder {

	public static StringBuffer changable = new StringBuffer();

	public static void main(String[] args) {

		Employee king = new Employee("KING");
		Employee blake = new Employee("BLAKE");
		king.addItem(blake);
		Employee clark = new Employee("CLARK");
		king.addItem(clark);
		Employee jones = new Employee("JONES");
		king.addItem(jones);

		Employee martin = new Employee("MARTIN");
		Employee allen = new Employee("ALLEN");
		Employee turner = new Employee("TURNER");
		Employee james = new Employee("JAMES");
		Employee ward = new Employee("WARD");
		blake.addItem(martin);
		blake.addItem(allen);
		blake.addItem(turner);
		blake.addItem(james);
		blake.addItem(ward);

		Employee miller = new Employee("MILLER");
		clark.addItem(miller);

		Employee scott = new Employee("SCOTT");
		jones.addItem(scott);
		Employee ford = new Employee("FORD");
		jones.addItem(ford);

		Employee adams = new Employee("ADAMS");
		scott.addItem(adams);

		Employee smith = new Employee("SMITH");
		ford.addItem(smith);
		jones.displayDetails();
	}

}
