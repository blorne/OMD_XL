package gui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import util.XLException;
import controller.Model;

public class Editor extends JTextField implements KeyListener, Observer {
    Model model;
    CurrentSlotIndicator currentSlot;
    StatusLabel statusLabel;
	
	public Editor(Model model, CurrentSlotIndicator currentSlot, StatusLabel statusLabel) {
        this.model = model;
        this.currentSlot = currentSlot;
        this.statusLabel = statusLabel;
		setBackground(Color.WHITE);
        addKeyListener(this);
        currentSlot.addObserver(this);
    }

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_ENTER:
				try {
				String exp = getText();
				model.add(currentSlot.getPos(), exp);
				setText(model.toString(currentSlot.getPos()));
				} catch(XLException exception) {
					statusLabel.setText(exception.getMessage());
					setText(model.toString(currentSlot.getPos()));
				}
		}
			
	}

	@Override
	public void keyReleased(KeyEvent arg0) {		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		setText(model.toString(currentSlot.getPos()));
		statusLabel.clear();
		
	}
}