package gui;

import java.awt.Color;

public class CurrentSlotIndicator {
	SlotLabel slot;
	
	CurrentSlotIndicator() {
		this.slot = null;
	}
	
	public void setCurrentSlot(SlotLabel slot) {
		this.slot = slot; 
		this.slot.setBackground(Color.WHITE);
	}
	
	public void changeCurrentTo(SlotLabel newSlot) {
		this.slot.setBackground(Color.WHITE);
		newSlot.setBackground(Color.YELLOW);
		this.slot = newSlot;
	}
}
