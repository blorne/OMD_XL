package gui.menu;

import gui.CurrentSlotIndicator;
import gui.StatusLabel;
import gui.XL;
import gui.XLList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import controller.Model;

public class XLMenuBar extends JMenuBar {
    public XLMenuBar(XL xl, XLList xlList, StatusLabel statusLabel, Model model, CurrentSlotIndicator currentSlot) {
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        file.add(new PrintMenuItem(xl, statusLabel));
        file.add(new SaveMenuItem(xl, statusLabel));
        file.add(new LoadMenuItem(xl, statusLabel));
        file.add(new NewMenuItem(xl));
        file.add(new CloseMenuItem(xl, xlList));
        edit.add(new ClearMenuItem(model, currentSlot, statusLabel));
        edit.add(new ClearAllMenuItem(model));
        add(file);
        add(edit);
        add(new WindowMenu(xlList));
    }
}