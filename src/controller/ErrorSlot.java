package controller;

import expr.Environment;
import util.XLException;

public class ErrorSlot implements Slot {

	@Override
	public double value(Environment e) {
		throw new XLException("Error");
	}
	
	public String toString(){
		throw new XLException("Error");
	}

}
