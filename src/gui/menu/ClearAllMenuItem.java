package gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import controller.Model;

class ClearAllMenuItem extends JMenuItem implements ActionListener {
	Model m;
	
	public ClearAllMenuItem(Model m) {
        super("Clear all");
        addActionListener(this);
        this.m = m;
    }

    public void actionPerformed(ActionEvent e) {
        m.removeAll();
    }
}