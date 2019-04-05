package com.techlab.node.test;

import java.util.Iterator;

import com.techlab.node.Node;

public class TestNode {

	public static void main(String[] args) {

		Node<Integer> first = new Node();
		first.setData(10);

		Node<Integer> second = new Node();
		second.setData(20);

		Node<Integer> third = new Node();
		third.setData(30);

		first.setNext(second);
		second.setNext(third);
		third.setNext(null);

		printNodeDetails(first);
	}

	private static <T> void printNodeDetails(Node<T> first) {

		Node<T> temp = first;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}
