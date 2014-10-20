package gui;

import java.awt.Color;
import java.util.Observable;

public class CurrentSlotIndicator extends Observable{
	String pos;
	
	CurrentSlotIndicator() {
	}
	
	public void changeCurrentTo(String pos) {
		this.pos = pos;
		setChanged();
		notifyObservers();
	}
	
	public String getPos() {
		return pos;
	}
}
