package com.techlabs.man.test;

import com.techlab.man.Boy;
import com.techlab.man.Infant;
import com.techlab.man.Kid;
import com.techlab.man.Man;

public class TestMan {

	public static void main(String[] args) {

		case1();
		case2();
		case3();
		case4();
	}

	private static void case1() {

		Man x;
		x=new Man();
		x.read();
		x.eat();
		x.play();
	}

	private static void case2() {

		Boy y;
		y=new Boy();
		y.eat();
		y.read();
		y.walk();
		y.play();
		
	}

	private static void case3() {

		Man x;
		x=new Boy();
		x.play();
		x.read();
		x.eat();
		x.play();
	}

	private static void case4() {

		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}

	private static void atThePark(Man x) {

		System.out.println("At the park");
		x.play();
	}

}
