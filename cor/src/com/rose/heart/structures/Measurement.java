package com.rose.heart.structures;



public class Measurement {
	
	String notation;
	IMeasurableStructure structure;
	DIAMKIND diamkind;
	Number value;
	
	
	
	public DIAMKIND getDiamkind() {
		return diamkind;
	}


	public void setDiamkind(DIAMKIND diamkind) {
		this.diamkind = diamkind;
	}
	
	
	public Number getValue() {
		return value;
	}


	public void setValue(Number value) {
		this.value = value;
	}
	
	
	protected IMeasurableStructure getStructure() {
		return structure;
	}


	public Measurement(DIAMKIND diamkind, IMeasurableStructure structure) {
		
		this.diamkind = diamkind;
		this.structure = structure;
	}
}
