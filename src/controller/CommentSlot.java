package controller;

import expr.Environment;

public class CommentSlot implements Slot{
private String comment;

	public CommentSlot(String comment){
		this.comment = comment;
	}

	public double value(Environment e) {
		return 0;
	}
	
	public String toString(){
		return comment;
	}

	@Override
	public String valueString(Environment e) {
		return comment;
		
	}

}
