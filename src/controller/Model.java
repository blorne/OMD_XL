package controller;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TreeMap;

import expr.Environment;

public class Model extends Observable implements Environment {
	private Map<String, Slot> map;
	
	public Model(){
		this.map = new TreeMap<String, Slot>();
	}
	
	public double value(String name) {
		return 0;
	}
	
	public void execute(String s, Observer o) {
		
	}
}
