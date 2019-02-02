package com.techlab.observer.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonObserverFrame extends JFrame {

	Container jContainer;
	JButton jButton;
	
	public ButtonObserverFrame() {
		
		jButton = new JButton("OK");
		setTitle("ButtonObserverFrame");
		setSize(500, 500);
		setLayout(null);
		
		jContainer=getContentPane();
		jButton.setBounds(150, 150, 100, 50);
		add(jButton);
		
		jContainer.add(jButton);
		jButton.addActionListener(new OKListener());
		jButton.addActionListener(new GoodByeListener());
		jButton.addActionListener(new ColorChangeLister());
		setVisible(true);
	}
}
