package com.techlab.singleton;

public class DataService {
	
	private static DataService container;
	
	private DataService() {
		System.out.println("DataService Object created");
	}
	
	public void doSomething() {
		System.out.println("Doing Data Service by "+this.hashCode());
	}
	
	public static DataService getInstance() {
		if(container==null) {
			container=new DataService();
		}
		return container;
	}
}
