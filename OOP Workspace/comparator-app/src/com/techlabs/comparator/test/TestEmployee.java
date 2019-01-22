package com.techlabs.comparator.test;

import java.util.*;

import com.techlab.comparator.Employee;
import com.techlab.comparator.MyComparator;

public class TestEmployee {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(new Employee(1, "KUNTAN"));
		ts.add(new Employee(2, "PRASAD"));
		ts.add(new Employee(3, "KIRAN"));

		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
