package com.rose.heart.structures;

public class RightVentricle extends Ventricle {

	Double basalDiam;
	Double midDiam;
	
	public RightVentricle(String notation) {
		super(notation);
		
	}
	
	public void setBasalDiam(Double diameter) {
		this.basalDiam = diameter;
	}
	
	public void setMidDiam(Double diameter) {
		this.midDiam = diameter;
	}

}
