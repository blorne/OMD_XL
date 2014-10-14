package controller;
import expr.Environment;

public interface Slot {
	
	public double value(Environment e);
	public String expressionString();
	public String valueString(Environment e);
}
