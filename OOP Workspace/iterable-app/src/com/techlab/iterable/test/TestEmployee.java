package com.techlab.iterable.test;
import java.util.*;
import com.techlab.iterable.employee.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "KUNTAN");
		Employee employee2 = new Employee(2, "PRASAD");
		Employee employee3 = new Employee(3, "KIRAN");
		
		ArrayList al = new ArrayList();
		al.add(employee1);
		al.add(employee2);
		al.add(employee3);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
