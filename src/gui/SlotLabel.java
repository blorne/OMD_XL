package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class SlotLabel extends ColoredLabel implements MouseListener {
    private String position;
	
	public SlotLabel(String position) {
        super("                    ", Color.WHITE, RIGHT);
        addMouseListener(this);
        this.position = position;
    }


	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Hej");
		super.setText(position);
		
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