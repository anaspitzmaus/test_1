package com.rose.heart.structures;



public class LeftAtrium extends Atrium {

	public LeftAtrium(String notation) {
		super(notation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object clone() {
	    LeftAtrium leftAtrium = null;
	    try {
	       leftAtrium = (LeftAtrium) super.clone();
	    } catch (CloneNotSupportedException e) {
	        leftAtrium = new LeftAtrium("Linker Vorhof");
	          
	    }
	   
	    return leftAtrium;
	}

}
