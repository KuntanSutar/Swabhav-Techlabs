package com.techlab.observer.common.listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintColorListener implements ActionListener {

	private CommonListenerFrame commonListenerFrame;
	private Container jContainer;

	public PrintColorListener(CommonListenerFrame commonListenerFrame) {
		this.commonListenerFrame=commonListenerFrame;
		jContainer=commonListenerFrame.getjContainer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Color changed to "+e.getActionCommand());
		if(e.getActionCommand()=="Red")
		{
			jContainer.setBackground(Color.red);
		}
		if(e.getActionCommand()=="Blue")
		{
			jContainer.setBackground(Color.blue);
		}
	}

}
