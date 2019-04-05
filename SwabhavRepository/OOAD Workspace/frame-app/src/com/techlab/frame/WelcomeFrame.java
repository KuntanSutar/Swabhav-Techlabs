package com.techlab.frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame extends JFrame {

	public WelcomeFrame() {
		
		this.setTitle("Welcome to UI App");
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(new JLabel("Welcome to UI App"));
	}
}
