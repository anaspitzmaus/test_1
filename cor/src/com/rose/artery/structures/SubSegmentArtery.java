package com.rose.artery.structures;

public class SubSegmentArtery {
	protected ConnectionAreaArtery conProx;
	protected ConnectionAreaArtery conDist;
	protected SubSegmentPartArtery plainSubSeg;
	SegmentArtery segment;
	
	public SubSegmentArtery() {
		conProx = new ConnectionAreaArtery();
		conDist = new ConnectionAreaArtery();
		plainSubSeg = new SubSegmentPartArtery();
	}
	
	protected ConnectionAreaArtery getProximalConnectionArea(){
		return this.conProx;
	}
	
	protected ConnectionAreaArtery getDistalConnectionArea(){
		return this.conDist;
	}

	protected void setSegment(SegmentArtery segment) {
		this.segment = segment;		
	}
	
	public SegmentArtery getSegment(){
		return this.segment;
	}
	
	
}
