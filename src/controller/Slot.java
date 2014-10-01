package controller;

public class Slot {
	private String index, value;
	
	public Slot (String index, String value) {
		this.index = index;
		this.value = value;
	}
	
	public String index(){
		return index;
	}
	
	public String value() {
		return value;
	}
}
