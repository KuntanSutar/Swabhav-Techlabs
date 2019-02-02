package com.techlab.pro.linkedlist;

public class CustomizedLinkedList<T> {

	private Node head;
	private int listSize;
	
	public CustomizedLinkedList() {
		head=new Node("");
		listSize=0;
	}
	
	public void add(T data) {
		Node endNode= new Node(data);
		Node currentNode=head;
		while(currentNode.getNext()!=null) {
			currentNode=currentNode.getNext();
		}
		currentNode.setNext(endNode);
		listSize++;
	}
	
	public void remove(T data) {
		
		Node<T> currentNode=head;
		while(currentNode.getNext()!=null) {
			if(currentNode.getNext().getData()==data) {
				currentNode.setNext(currentNode.getNext().getNext());
				listSize--;
			}
			currentNode=currentNode.getNext();
		}
		System.out.println("No such Node!");
	}
	
	public void display() {
		Node currentNode=head;
		while(currentNode.getNext()!=null) {
			System.out.println(currentNode.getData());
			currentNode=currentNode.getNext();
		}
		System.out.println(currentNode.getData());
	}
	
}
