package gui.menu;

import gui.CurrentSlotIndicator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import controller.Model;

class ClearMenuItem extends JMenuItem implements ActionListener {
	Model m;
	CurrentSlotIndicator currentSlot;
	
    public ClearMenuItem(Model m, CurrentSlotIndicator currentSlot) {
        super("Clear");
        addActionListener(this);
        this.m = m;
        this.currentSlot = currentSlot;
    }

    public void actionPerformed(ActionEvent e) {
        m.remove(currentSlot.getName());
    }
}