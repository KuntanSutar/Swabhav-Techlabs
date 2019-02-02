package com.techlab.observer.common.listener;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CommonListenerFrame extends JFrame {

	private Container jContainer;
	private JButton jButton1, jButton2;
	
	public Container getjContainer() {
		return jContainer;
	}

	public JButton getjButton1() {
		return jButton1;
	}

	public JButton getjButton2() {
		return jButton2;
	}

	public CommonListenerFrame() {
		jButton1 = new JButton("RED");
		jButton2 = new JButton("BLUE");
		setTitle("CommonListenerFrame");
		setSize(500, 500);
		setLayout(new FlowLayout());
		jContainer=getContentPane();
		jButton1.setBounds(100, 100, 100, 50);
		jButton2.setBounds(250, 100, 100, 50);
		
		jContainer.add(jButton1);
		jContainer.add(jButton2);
		jButton1.addActionListener(new PrintColorListener(this));
		jButton2.addActionListener(new PrintColorListener(this));
		jButton1.addMouseListener(new ColorChangeListener(this));
		jButton2.addMouseListener(new ColorChangeListener(this));
		setLayout(null);
		setVisible(true);
	}
}
