package com.techlab.singleton;

public class SingleObjectProducer {

	private static SingleObjectProducer obj;

	private SingleObjectProducer() {
	}

	public static SingleObjectProducer getInstance() {
		if (obj == null) {
			obj = new SingleObjectProducer();
		}
		return obj;
	}
	
	public void produceOnlySingleObject() {
		System.out.println("Only single object produced!!!");
	}
}
