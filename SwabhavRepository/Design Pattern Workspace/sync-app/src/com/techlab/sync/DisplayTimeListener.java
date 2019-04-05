package com.techlab.sync;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayTimeListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		while(true) {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			String date=dateFormat.format(calendar.getTime());
			System.out.println(date);
		}
	}

}
