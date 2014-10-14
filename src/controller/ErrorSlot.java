package controller;

import expr.Environment;
import expr.Expr;
import util.XLException;

public class ErrorSlot implements Slot {

	public ErrorSlot(){
	}
	
	public double value(Environment e) {
		throw new XLException("Error");
	}
	
	public String toString(){
		throw new XLException("Error");
	}

}
