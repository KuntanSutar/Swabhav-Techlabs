package com.techlab.observer.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Color change");
	}

}
