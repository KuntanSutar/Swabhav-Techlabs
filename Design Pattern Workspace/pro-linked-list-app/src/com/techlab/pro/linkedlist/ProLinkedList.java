package com.techlab.pro.linkedlist;

public class ProLinkedList<T> {

	private Node head;
	private int listSize;
	 
	public ProLinkedList(T data) {
		head=new Node(data);
	}
	
	public <T> void add(T data) {
		
		Node<T> currentNode=head;
		Node endNode= new Node(data);
		while(currentNode.getNext()!=null) {
			currentNode=currentNode.getNext();
		}
		currentNode.setNext(endNode);
		listSize++;
	}
	
	public <T> void remove(T data) {
		
		Node<T> currentNode=head;
		
		while(currentNode!=null) {
			if(currentNode.getData()==data) {
				currentNode.setNext(currentNode.getNext().getNext());
				listSize--;
			}
			currentNode=currentNode.getNext();
		}
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
