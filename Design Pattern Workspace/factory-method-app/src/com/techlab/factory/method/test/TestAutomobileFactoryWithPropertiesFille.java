package com.techlab.factory.method.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.lang.reflect.*;

import com.techlab.factory.method.BMWFactory;
import com.techlab.factory.method.IAutomobile;
import com.techlab.factory.method.IAutomobileFactory;

public class TestAutomobileFactoryWithPropertiesFille {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class cl = Class.forName(loadFactory());
		Method method = cl.getDeclaredMethod("getInstance");
		IAutomobileFactory automobileFactory=(IAutomobileFactory) method.invoke(null, null);
		IAutomobile bmw = automobileFactory.make();
		bmw.start();
		bmw.stop();
		
	}

	public static String loadFactory() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("\\KUNTAN\\SwabhavRepository\\"
				+ "Design Pattern Workspace\\factory-method-app\\data\\config.properties");
		properties.load(fis);
		String currentFactory = properties.getProperty("currentFactory");
		return currentFactory;
	}
}
