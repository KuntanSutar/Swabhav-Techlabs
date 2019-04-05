package com.techlab.node;

import java.util.Iterator;

public class Node<T> {

	private int data;
	private Node<T> next;
	
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public Node<T> getNext() {
		return next;
	}
	
}
