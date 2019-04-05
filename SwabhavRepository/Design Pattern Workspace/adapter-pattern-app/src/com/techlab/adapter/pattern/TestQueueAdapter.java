package com.techlab.adapter.pattern;

public class TestQueueAdapter {

	public static <T> void main(String[] args) {

		QueueAdapter<Integer> queueAdapterInteger = new QueueAdapter();
		queueAdapterInteger.enque(10);
		queueAdapterInteger.enque(20);
		queueAdapterInteger.enque(30);
		System.out.println(queueAdapterInteger.deque());
		
		System.out.println(queueAdapterInteger.getSize());
		
		QueueAdapter<String> queueAdapterString = new QueueAdapter();
		queueAdapterString.enque("Kuntan");
		queueAdapterString.enque("Prasad");
		queueAdapterString.enque("Kiran");
		System.out.println(queueAdapterString.getSize());
		
		for(Integer number:queueAdapterInteger) {
			System.out.println(number);
		}
		
		for(String name:queueAdapterString) {
			System.out.println(name);
		}
	}

}
