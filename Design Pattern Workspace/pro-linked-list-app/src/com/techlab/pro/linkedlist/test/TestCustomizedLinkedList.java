package com.techlab.pro.linkedlist.test;

import com.techlab.pro.linkedlist.ProLinkedList;
import com.techlab.pro.linkedlist.Student;

public class TestCustomizedLinkedList {

	public static void main(String[] args) {

		ProLinkedList<Integer> proLinkedList1 = new ProLinkedList(10);
		proLinkedList1.add(20);
		proLinkedList1.add(30);
		proLinkedList1.add(40);
		proLinkedList1.remove(30);
		proLinkedList1.display();
		
		Student student1 = new Student("Kuntan");
		ProLinkedList<Student> proLinkedList2 = new ProLinkedList(student1);
		
		Student student2 = new Student("Prasad");
		proLinkedList2.add(student2);
		
		Student student3 = new Student("Shubham");
		proLinkedList2.add(student3);
		
		proLinkedList2.display();
		
		proLinkedList2.remove(student2);
		proLinkedList2.display();
	}

}
