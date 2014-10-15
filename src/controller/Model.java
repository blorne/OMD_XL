package controller;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import util.*;


import expr.Environment;

public class Model extends Observable implements Environment {
	private Map<String, Slot> map;
	private SlotSelector slotSelect;
	
	public Model(){
		map = new HashMap<String, Slot>();
		slotSelect = new SlotSelector();
	}
	
	public double value(String name) {
		Slot s= map.get(name);
		if(s==null){
			throw new XLException("Cannot refer to an empty slot ("+name+")");
		}
		return s.value(this);
	}
	
	public String expressionString(String name){
		Slot s= map.get(name);
		if(s==null){
			return "";
		}
		return s.expressionString();
	}
	
	public String valueString(String name){
		Slot s= map.get(name);
		if(s==null){
			return "";
		}
		return s.valueString(this);
	}
	
	
	public void fillSlot(String name, String input) {
		Slot slot = slotSelect.build(input);
		if(map.get(name)==null){
		circularCheck(name, slot);	
		}
		map.put(name, slot);
		updateModel();
	}
	
	private void circularCheck(String name, Slot slot){
		Slot temp = map.get(name);
		ErrorSlot circularity = new ErrorSlot();
		map.put(name, circularity);
		try {
			slot.value(this);
		} finally {
			map.put(name, temp);
		}

	}
	
	private void updateModel(){
		setChanged();
		notifyObservers();
	}

}
