package controller;

import expr.Environment;
import expr.Expr;

public class ExpressionSlot implements Slot {
	private Expr expr;
	
	public ExpressionSlot(Expr expr){
		this.expr = expr;
	}
	
	@Override
	public double value(Environment e) {
		return expr.value(e);
	}
	
	public String toString(){
		return expr.toString();
	}

	@Override
	public String valueString(Environment e) {
		return String.valueOf(expr.value(e));
	}
}
