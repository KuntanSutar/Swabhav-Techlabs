package com.techlab.objectwithoutnewoperator;
import java.io.*;

public class ObjectWithoutNewOperator {

	public Object creatObjectUsingNewInstanceMethod(String newClassName) throws Exception {
		
		Class cls = Class.forName(newClassName);
		Object obj = cls.newInstance();
		return obj;
	}

	public Object creatObjectUsingCloneMethod(Auto newObject) throws Exception {
		
		Object obj = newObject.clone();
		return obj;
	}

	public Object creatObjectUsingDeserialization(File fl) throws Exception {
		
		FileInputStream fis = new FileInputStream(fl);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student serializedObject = (Student) ois.readObject();
		ois.close();
		return serializedObject;
	}

}
