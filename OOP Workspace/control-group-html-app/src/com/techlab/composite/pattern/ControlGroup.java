package com.techlab.composite.pattern;
import java.util.ArrayList;
import com.techlab.composite.pattern.test.TestControlGroup;

public class ControlGroup implements IControl {

	private String tag;
	private String context = " ";
	private ArrayList<IControl> tagList;
	
	public ControlGroup(String newTag) {
		tag=newTag;
		tagList=new ArrayList();
	}
	
	public ControlGroup(String newTag, String newContext) {
		tag=newTag;
		context=newContext;
		tagList=new ArrayList();
	}
	
	public void addChildTag(IControl newIControl) {
		tagList.add(newIControl);
	}

	@Override
	public void displayDOM() {
		
		System.out.println(TestControlGroup.changable+"<"+tag+">"+" "+context);
		TestControlGroup.changable.append("\t");
		for(IControl tag : tagList) {
			IControl itag = (IControl)tag;
			itag.displayDOM();
		}
		TestControlGroup.changable.setLength(TestControlGroup.changable.length()-1);
		System.out.println(TestControlGroup.changable+"</"+tag+">");
	}

}
