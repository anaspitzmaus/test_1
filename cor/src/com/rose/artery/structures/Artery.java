package com.rose.artery.structures;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import com.rose.heart.structures.Cavum;

public class Artery extends Cavum{

	LinkedList<SegmentArtery> segments;
	String notation;
	
	protected void addSegment(SegmentArtery segment){
		if(segment instanceof SegmentArtery){
			try {
				if(this.segments.getLast().subsegments.getLast() instanceof SubSegmentArtery){//if there already exists a subsegment 
					new Junction(this.segments.getLast().subsegments.getLast(), segment.subsegments.getFirst());//declare a new Junction			
				}
				segments.add(segment);
				segment.setArtery(this);
			} catch (NoSuchElementException e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	public Artery(String notation) {
		super(notation);
		segments = new LinkedList<SegmentArtery>();
		this.notation = notation;
	}
	
	/**
	 * get the most proximal connection area of this artery
	 * @return the most proximal connection area of this artery
	 */
	protected ConnectionAreaArtery getProximalConnectionArea(){
		ConnectionAreaArtery proximalConArea = segments.getFirst().subsegments.getFirst().conProx;
		return proximalConArea;
	}
	
	/**
	 * get the most distal connection area of this artery
	 * @return the most distal connection area of this artery
	 */
	protected ConnectionAreaArtery getDistalConnectionArea(){
		ConnectionAreaArtery distalConArtery = segments.getLast().subsegments.getLast().conDist;
		return distalConArtery;
	}
}
