package com.techlab.observer.common.listener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorChangeListener implements MouseListener {

	private CommonListenerFrame commonListenerFrame;
	public ColorChangeListener(CommonListenerFrame newCommonListenerFrame) {
		commonListenerFrame=newCommonListenerFrame;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==commonListenerFrame.getjButton1()) {
			commonListenerFrame.getjContainer().setBackground(Color.RED);
		}
		if(e.getSource()==commonListenerFrame.getjButton2()) {
			commonListenerFrame.getjContainer().setBackground(Color.BLUE);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
