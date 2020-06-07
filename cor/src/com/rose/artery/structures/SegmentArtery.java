package com.rose.artery.structures;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SegmentArtery {
	protected LinkedList<SubSegmentArtery> subsegments;
	String notation;
	Artery artery;
	Double diameter;
	
	protected void setSubsegments(LinkedList<SubSegmentArtery> subsegments) {
		this.subsegments = subsegments;
	}
	
	protected void setArtery(Artery artery){
		this.artery = artery;
	}
	
	public Artery getArtery(){
		return this.artery;
	}
	
	public SegmentArtery(String notation) {
		this.notation = notation;
		subsegments = new LinkedList<SubSegmentArtery>();
	}
	
	public Double getDiameter() {
		return this.diameter;
	}
	
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	/**
	 * adds a subSegment at the end of the segment
	 * before adding the subSegment, a new junction is defined 
	 * @param subSegment
	 */
	public void addSubSegment(SubSegmentArtery subSegment) {
		if(subSegment instanceof SubSegmentArtery){
			try {
				if(this.subsegments.getLast() instanceof SubSegmentArtery){//if there already exists a subsegment 
					new Junction(this.subsegments.getLast(), subSegment);//declare a new Junction			
				}
				subsegments.add(subSegment);
				subSegment.setSegment(this);
			} catch(NoSuchElementException e) {
				// TODO: handle exception
			}
			
			
		}
	}
}
