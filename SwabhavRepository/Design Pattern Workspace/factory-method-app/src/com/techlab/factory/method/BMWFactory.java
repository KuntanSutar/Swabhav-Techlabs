package com.techlab.factory.method;

public class BMWFactory implements IAutomobileFactory {

	private static BMWFactory container;
	
	private BMWFactory() {
		
	}
	
	@Override
	public IAutomobile make() {
		return new BMW();
	}

	public static BMWFactory getInstance() {
		if(container==null) {
			container=new BMWFactory();
		}
		return container;
	}
}
