package controller;

import util.XLException;
import expr.ExprParser;

public class SlotSelector {
	
	public Slot build(String s){
		ExprParser pars= new ExprParser();
		
		if(s.length()>0){
			if(s.charAt(0)== '#'){
				return new CommentSlot(s);
			}else{ 
				try{
					return new ExpressionSlot(pars.build(s));
				} catch (Exception e){
					throw new XLException("Parsing Error");
				}
			}
		}
		return null;
	}
}
