package com.techlab.observer.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodByeListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Good Bye Listener");
	}

}
