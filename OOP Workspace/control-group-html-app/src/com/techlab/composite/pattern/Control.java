package com.techlab.composite.pattern;

import com.techlab.composite.pattern.test.TestControlGroup;

public class Control implements IControl {

	private String tag;
	private String type;

	public Control(String newTag, String newType) {
		tag=newTag;
		type=newType;
	}
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public void displayDOM() {
		System.out.println(TestControlGroup.changable+"<"+tag+" type=\""+type+"\">");
	}

}
