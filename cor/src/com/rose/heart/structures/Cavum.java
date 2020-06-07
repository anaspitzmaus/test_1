package com.rose.heart.structures;

import java.util.ArrayList;

public class Cavum implements Cloneable, IMeasurableStructure{
	protected Double height, width, depth;
	protected String notation;
	protected Wall wall;
	protected ArrayList<Measurement> values;
	
	
	public Wall getWall() {
		return this.wall;
	}
	
	public void setWall(Wall wall) {
		this.wall = wall;
	}
		
	public Cavum(String notation) {
		this.notation = notation;
		values = new ArrayList<Measurement>();
	}		
	
	
	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
	}

	@Override
	public ArrayList<Measurement> getMeasurements() {
		return this.values;
	}
	
	
}
