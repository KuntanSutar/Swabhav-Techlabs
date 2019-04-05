package com.techlab.async;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelloListener implements ActionListener {

	private AsyncFrame syncFrame;
	
	public HelloListener(AsyncFrame newSyncFrame) {
		syncFrame=newSyncFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame helloFrame = new JFrame();
		JOptionPane.showMessageDialog(helloFrame, "Hello");
	}

}
