package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import controller.Model;

public class SlotLabel extends ColoredLabel implements MouseListener, Observer {
    private String position;
    private CurrentSlotIndicator currentSlot;
    private Model model;
	
	public SlotLabel(String position, CurrentSlotIndicator currentSlot, Model model) {
        super("                    ", Color.WHITE, RIGHT);
        addMouseListener(this);
        this.position = position;
        this.currentSlot = currentSlot;
        this.model = model;
        model.addObserver(this);
    }
	
	public String getPosition() {
		return this.position;
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		this.currentSlot.changeCurrentTo(this);
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void update(Observable arg0, Object arg1) {
		this.setText(model.valueString(position));
		
	}

}	