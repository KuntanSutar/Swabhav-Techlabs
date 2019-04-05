package com.techlab.async;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayTimeListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t1 = new Thread(new DisplayTime());
		t1.start();
	}

}
