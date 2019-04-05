package com.techlab.composite.pattern.test;

import com.techlab.composite.pattern.Control;
import com.techlab.composite.pattern.ControlGroup;

public class TestControlGroup {

	public static StringBuffer changable = new StringBuffer();
	
	public static void main(String[] args) {
		
		ControlGroup htmlRoot = new ControlGroup("html");
		ControlGroup bodyRoot = new ControlGroup("body");
		ControlGroup divRoot = new ControlGroup("div");
		ControlGroup paraForName = new ControlGroup("p", "Enter Name : ");
		Control enterName = new Control("input", "text");
		divRoot.addChildTag(paraForName);
		paraForName.addChildTag(enterName);
		bodyRoot.addChildTag(divRoot);
		htmlRoot.addChildTag(bodyRoot);
		htmlRoot.displayDOM();
	}

}
