package com.techlab.simple.factory;

public class AutomationFactory {

	public static AutomationFactory container;
	
	private AutomationFactory() {
		
	}
	public IAutomation make(AutoConfigType newAutoConfigType) {
		
		if(newAutoConfigType==AutoConfigType.AUDI) {
			return new Audi();
		}
		if(newAutoConfigType==AutoConfigType.BMW) {
			return new BMW();
		}
		if(newAutoConfigType==AutoConfigType.MINI) {
			return new MiniCooper();
		}
		return null;
	}
	
	public static AutomationFactory getInstance() {
		if(container==null) {
			container=new AutomationFactory();
		}
		return container;
	}
}
