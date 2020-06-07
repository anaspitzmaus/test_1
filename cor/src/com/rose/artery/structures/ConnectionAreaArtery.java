package com.rose.artery.structures;

public class ConnectionAreaArtery {
	SubSegmentPartArtery subSegmentPraeCon;
	SubSegmentPartArtery subSegmentCon;
	Junction junction;
	
	
	
	protected Junction getJunction() {
		return junction;
	}



	protected void setJunction(Junction junction) {
		this.junction = junction;
	}



	public ConnectionAreaArtery() {
		subSegmentPraeCon = new SubSegmentPartArtery();
		subSegmentCon = new SubSegmentPartArtery();		
	}
}
