package com.rose.artery;

import com.rose.artery.structures.SegmentArtery;
import com.rose.artery.structures.SubSegmentArtery;
import com.rose.heart.structures.SL_Valve;

public class AorticRoot extends SegmentArtery {

	SubSegmentArtery annulus, sinusValsalva, sinutubular; //subsegments of aortic root
	SL_Valve sl_valve;
	
	public AorticRoot() {
		super("root");
		//declare the subsegments of the root
		annulus = new SubSegmentArtery();
		sinusValsalva = new SubSegmentArtery();
		sinutubular = new SubSegmentArtery();
		//add the subsegments to the root segment
		addSubSegment(annulus);
		addSubSegment(sinusValsalva);
		addSubSegment(sinutubular);		
	}
	
	protected void setSL_Valve(SL_Valve valve){
		this.sl_valve = valve;
	}

}
