package com.techlabs.objectwithoutnewoprator.test;
import java.io.*;
import com.techlab.objectwithoutnewoperator.Auto;
import com.techlab.objectwithoutnewoperator.ObjectWithoutNewOperator;

public class TestObjectWithoutNewOperator {

	public static void main(String[] args) throws Exception {
		
		ObjectWithoutNewOperator owno = new ObjectWithoutNewOperator();
		Object obj1 = owno.creatObjectUsingNewInstanceMethod("com.techlab.objectwithoutnewoperator.Auto");
		System.out.println(obj1);
		
		Auto example = new Auto();
		Object obj2 = owno.creatObjectUsingCloneMethod(example);
		System.out.println(obj2);
		
		File fl = new File("D:\\Kuntan\\SwabhavRepository\\OOP Workspace\\object-without-new-operator-app\\src\\com\\techlab\\objectwithoutnewoperator\\Student.txt");
		Object obj3 = owno.creatObjectUsingDeserialization(fl);
		System.out.println(obj3);
	}

}
