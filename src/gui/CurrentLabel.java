package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class CurrentLabel extends ColoredLabel implements Observer {
	CurrentSlotIndicator currentSlot;
    public CurrentLabel(CurrentSlotIndicator currentSlot) {
        super("A1=", Color.WHITE);
        currentSlot.addObserver(this);
        this.currentSlot = currentSlot;
    }

	@Override
	public void update(Observable arg0, Object arg1) {
		setText(currentSlot.getName() + "=  ");		
	}
}