package gui.menu;

import gui.CurrentSlotIndicator;
import gui.StatusLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import util.XLException;
import controller.Model;

class ClearMenuItem extends JMenuItem implements ActionListener {
	Model m;
	CurrentSlotIndicator currentSlot;
	StatusLabel sL;
	
    public ClearMenuItem(Model m, CurrentSlotIndicator currentSlot, StatusLabel sL) {
        super("Clear");
        addActionListener(this);
        this.m = m;
        this.currentSlot = currentSlot;
        this.sL = sL;
    }

    public void actionPerformed(ActionEvent e) {
       	try {
       		m.add(currentSlot.getPos(), "");	       		
       	} catch (XLException ex) {
       		sL.setText(ex.getMessage());
       	}
    	
    }
}