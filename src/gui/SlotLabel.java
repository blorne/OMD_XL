package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class SlotLabel extends ColoredLabel implements MouseListener {
    private String position;
    private CurrentSlotIndicator currentSlot;
	
	public SlotLabel(String position, CurrentSlotIndicator currentSlot) {
        super("                    ", Color.WHITE, RIGHT);
        addMouseListener(this);
        this.position = position;
        this.currentSlot = currentSlot;
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

}	