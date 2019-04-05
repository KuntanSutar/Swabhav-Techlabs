package com.techlab.factory.method.test;

import java.io.IOException;
import com.techlab.factory.method.BMWFactory;
import com.techlab.factory.method.IAutomobile;
import com.techlab.factory.method.IAutomobileFactory;

public class TestAutomobileFactory {

	public static void main(String[] args) throws IOException {

		IAutomobileFactory automobileFactory = BMWFactory.getInstance();
		IAutomobile bmw = automobileFactory.make();
		bmw.start();
		bmw.stop();
	}
}
