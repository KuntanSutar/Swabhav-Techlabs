package com.techlab.pro.linkedlist.test;

import com.techlab.pro.linkedlist.CustomizedLinkedList;
import com.techlab.pro.linkedlist.Student;

public class TestCustomizedLinkedList {

	public static void main(String[] args) {

		CustomizedLinkedList<Integer> customizedLinkedList1 = new CustomizedLinkedList();
		customizedLinkedList1.add(20);
		customizedLinkedList1.add(30);
		customizedLinkedList1.add(40);
		customizedLinkedList1.remove(30);
		customizedLinkedList1.display();
		
		CustomizedLinkedList<Student> customizedLinkedList2 = new CustomizedLinkedList();
		Student student1 = new Student("Kuntan");
		customizedLinkedList2.add(student1);
		
		Student student3 = new Student("Prasad");
		customizedLinkedList2.add(student3);
		
		Student student2 = new Student("Kedar");
		customizedLinkedList2.add(student2);
		
		customizedLinkedList2.remove(student3);
		customizedLinkedList2.display();
		
		//customizedLinkedList2.remove("Kedar");
		customizedLinkedList2.display();
	}

}
