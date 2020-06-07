package com.rose.artery;

import com.rose.artery.structures.Artery;
import com.rose.artery.structures.SegmentArtery;
import com.rose.artery.structures.SubSegmentArtery;

public class Aorta extends Artery {
	SegmentArtery root, ascendens, arch, descendens;//segments of the aorta
	
	SubSegmentArtery subAscendens;
	
	public AorticRoot getAorticRoot() {
		return (AorticRoot) this.root;
	}
	
	public SegmentArtery getAscSeg() {
		return this.ascendens;
	}
	
	public Aorta() {
		super("Aorta");
		root = new AorticRoot();//declare the root segment	
		
		//add the root segment to the aorta
		addSegment(root);
		
		ascendens = new SegmentArtery("ascendens");//declare the ascendens part
		
		subAscendens = new SubSegmentArtery();
		ascendens.addSubSegment(subAscendens);
		
		addSegment(ascendens);
		
	}
	
}
