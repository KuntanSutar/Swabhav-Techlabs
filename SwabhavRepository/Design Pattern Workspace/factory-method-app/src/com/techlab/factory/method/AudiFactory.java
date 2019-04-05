package com.techlab.factory.method;

public class AudiFactory implements IAutomobileFactory {

	private static AudiFactory container;
	
	private AudiFactory() {
	}
	
	
	@Override
	public IAutomobile make() {
		return new AUDI();
	}
	
	public static AudiFactory getInstance() {
		if(container==null) {
			container=new AudiFactory();
		}
		return container;
	}

}
