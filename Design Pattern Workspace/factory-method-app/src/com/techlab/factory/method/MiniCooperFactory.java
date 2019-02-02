package com.techlab.factory.method;

public class MiniCooperFactory implements IAutomobileFactory {

	private static MiniCooperFactory container;
	
	private MiniCooperFactory() {
	}
	
	@Override
	public IAutomobile make() {
		return new MiniCooper();
	}

	public static MiniCooperFactory getInstance() {
		if(container==null) {
			container=new MiniCooperFactory();
		}
		return container;
	}
	
}
