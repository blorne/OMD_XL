package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

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
	
	
	public void add(String name, String input) {
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
	
	public void remove(String name) {
		if (map.containsKey(name)){
			Slot temp = map.remove(name);
			if(!mapCheck()){;
			map.put(name, temp);
			}
			updateModel();
		}
	}
		
	private boolean mapCheck() throws XLException {
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String current = itr.next(); 
			try {
				map.get(current).value(this);
			} catch (XLException e) {
				throw e;
			}
		}
		return true;
	}	
	
	public void removeAll(){
		map.clear();
		updateModel();
	}
	
	private void updateModel(){
		setChanged();
		notifyObservers();
	}

	public void save(String fileName) throws IOException{
		XLPrintStream printer= new XLPrintStream(fileName);
		printer.save(map.entrySet());
		printer.close();
		
	}
	
	public void load(String path) throws IOException {
		XLBufferedReader reader = new XLBufferedReader(path);
		removeAll();
		reader.load(map);
		updateModel();
		reader.close();
	}
}
