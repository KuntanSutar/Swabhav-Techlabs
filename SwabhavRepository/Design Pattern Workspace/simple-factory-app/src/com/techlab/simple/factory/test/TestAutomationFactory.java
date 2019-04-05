package com.techlab.simple.factory.test;

import com.techlab.simple.factory.AutoConfigType;
import com.techlab.simple.factory.AutomationFactory;
import com.techlab.simple.factory.IAutomation;

public class TestAutomationFactory {

	public static void main(String[] args) {
		
		AutomationFactory automationFactory= AutomationFactory.getInstance();
		IAutomation audi = automationFactory.make(AutoConfigType.AUDI);
		audi.start();
		audi.stop();
	}

}
