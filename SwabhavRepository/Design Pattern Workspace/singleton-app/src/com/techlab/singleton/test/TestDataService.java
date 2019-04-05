package com.techlab.singleton.test;

import com.techlab.singleton.DataService;
import com.techlab.singleton.DataServiceEnum;

public class TestDataService {

	public static void main(String[] args) {
		
		DataService dataService1 = DataService.getInstance();
		DataService dataService2 = DataService.getInstance();
		dataService1.doSomething();
		dataService2.doSomething();
		DataServiceEnum dataServiceEnum1 = DataServiceEnum.OBJECT;
		DataServiceEnum dataServiceEnum2 = DataServiceEnum.OBJECT;
		System.out.println(dataServiceEnum1.hashCode());
		System.out.println(dataServiceEnum2.hashCode());
	}

}
