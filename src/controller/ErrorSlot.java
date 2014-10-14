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
	
	public String expressionString(){
		throw new XLException("Error");
	}

	@Override
	public String valueString(Environment e) {
		throw new XLException("Error");
	}

}
