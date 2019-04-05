package com.techlab.async;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayTime implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			String date=dateFormat.format(calendar.getTime());
			System.out.println(date);
		}

	}

}
