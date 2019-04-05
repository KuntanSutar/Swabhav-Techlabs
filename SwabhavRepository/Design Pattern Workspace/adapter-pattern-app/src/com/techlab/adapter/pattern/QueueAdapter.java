package com.techlab.adapter.pattern;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements Iterable<T> {

	private final LinkedList<T> queue = new LinkedList();
	
	public void enque(T number) {
		queue.add(number);
	}
	
	public T deque() {
		return queue.remove();
	}
	
	public int getSize() {
		return queue.size();
	}

	@Override
	public Iterator iterator() {
		return queue.iterator();
	}
}
