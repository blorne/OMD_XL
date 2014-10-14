package controller;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import util.*;


import expr.Environment;

public class Model extends Observable implements Environment {
	private Map<String, Slot> map;
	
	public Model(){
		this.map = new HashMap<String, Slot>();
	}
	
	public double value(String name) {
	Slot s= map.get(name);
	if(s==null){
		throw new XLException("Cannot refer to an empty slot");
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
	
	
	public void execute(String s, Observer o) {
		
	}
	
}
