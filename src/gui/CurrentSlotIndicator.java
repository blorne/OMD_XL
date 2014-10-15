package gui;

import java.awt.Color;
import java.util.Observable;

public class CurrentSlotIndicator extends Observable{
	private SlotLabel slot;
	
	CurrentSlotIndicator() {
	}
	
	public void setCurrentSlot(SlotLabel slot) {
		this.slot = slot; 
		slot.setBackground(Color.YELLOW);
	}
	
	public void changeCurrentTo(SlotLabel newSlot) {
		slot.setBackground(Color.WHITE);
		newSlot.setBackground(Color.YELLOW);
		slot = newSlot;
		setChanged();
		notifyObservers();
	}
	
	public String getName() {
		return slot.getPosition();
	}
}
