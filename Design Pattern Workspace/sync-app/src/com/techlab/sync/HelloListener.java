package com.techlab.sync;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelloListener implements ActionListener {

	private SyncFrame syncFrame;
	
	public HelloListener(SyncFrame newSyncFrame) {
		syncFrame=newSyncFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame helloFrame = new JFrame();
		JOptionPane.showMessageDialog(helloFrame, "Hello");
	}

}
