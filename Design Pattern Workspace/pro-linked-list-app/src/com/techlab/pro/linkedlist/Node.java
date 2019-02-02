package com.techlab.pro.linkedlist;

import java.util.Iterator;

public class Node<T> implements Iterator {

	private T data;
	private Node<T> next=null;
	
	public void setData(T data) {
		this.data = data;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public Node<T> getNext() {
		return next;
	}
	
	public Node(T data) {
		this.data = data;
	}
	
	@Override
	public boolean hasNext() {
		if(next!=null) {
			return true;
		}
		return false;
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
