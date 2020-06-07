package com.rose.artery;

import com.rose.artery.structures.Artery;
import com.rose.artery.structures.SegmentArtery;
import com.rose.artery.structures.SubSegmentArtery;

public class CoronaryTree {
	Artery LCA, RCA, LCA_Main, RIVA, LCX, RIVP, RPLAd, D1, D2, PLA1, PLA2;
	
	
	public CoronaryTree() {
		RCA = new Artery("RCA");
		
		SegmentArtery RCA_proximal = new SegmentArtery("proximal");
		SegmentArtery RCA_medial = new SegmentArtery("medial");
		SegmentArtery RCA_distal = new SegmentArtery("distal");
		
		SubSegmentArtery RCA_proximal_plain = new SubSegmentArtery();
		SubSegmentArtery RCA_medial_plain = new SubSegmentArtery();
		SubSegmentArtery RCA_distal_plain = new SubSegmentArtery();
		
		RCA_proximal.addSubSegment(RCA_proximal_plain);
		RCA_medial.addSubSegment(RCA_medial_plain);
		RCA_distal.addSubSegment(RCA_distal_plain);
		
		
		
		
		
	}
}
