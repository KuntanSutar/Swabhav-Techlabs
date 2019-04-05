package com.techlab.async;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AsyncFrame extends JFrame {
	
	JButton helloButton, displayButton;
	public AsyncFrame() {
		helloButton=new JButton("Hello");
		displayButton=new JButton("Display Time");
		
		helloButton.setBounds(20, 20, 80, 30);
		displayButton.setBounds(160, 20, 120, 30);
		
		helloButton.addActionListener(new HelloListener(this));
		displayButton.addActionListener(new DisplayTimeListener());
		add(helloButton);
		add(displayButton);
		
		setLayout(null);
		setSize(600, 400);
		setVisible(true);
	}
}
