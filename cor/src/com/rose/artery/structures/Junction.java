package com.rose.artery.structures;

import java.util.ArrayList;


public class Junction extends SubSegmentArtery{
	ConnectionAreaArtery proximalConnectionArea;
	ArrayList<ConnectionAreaArtery> distalConnectionAreas; 
	
	public Junction(SubSegmentArtery subSegmentProx, SubSegmentArtery subSegmentDist) {
		proximalConnectionArea = subSegmentProx.getDistalConnectionArea();
		distalConnectionAreas = new ArrayList<ConnectionAreaArtery>();
		distalConnectionAreas.add(subSegmentDist.getProximalConnectionArea());
		proximalConnectionArea.setJunction(this);
		subSegmentDist.getProximalConnectionArea().setJunction(this);		
	}
	
	
	
	/**
	 * add an artery to the junction
	 * the artery is connected by its proximal connection area
	 * the artery can only be connected, if the proximal connection area isn't already part of a junction
	 * @param artery the artery to be connected
	 */
	protected void connectArtery(Artery artery){
		//adding the artery to a junction is allowed only if the proximal connection area of this artery 
		//isn't already connected to an artery
		if(artery.getProximalConnectionArea().getJunction() == null){
			this.distalConnectionAreas.add(artery.getProximalConnectionArea());
			artery.getProximalConnectionArea().setJunction(this);
		}
	}
}
