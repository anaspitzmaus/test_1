package com.rose.heart.structures;

import java.util.ArrayList;

public class Valve {
	ArrayList<Leaf> leaves;
	Cavum cavumProx;
	Cavum cavumDist;
	StenosisValve stenosis;
	Regurgitation regurgitation;
	
	protected ArrayList<Leaf> getLeaves() {
		return leaves;
	}
	protected void setLeaves(ArrayList<Leaf> leaves) {
		this.leaves = leaves;
	}
	protected Cavum getCavumProx() {
		return cavumProx;
	}
	public void setCavumProx(Cavum cavumProx) {
		this.cavumProx = cavumProx;
	}
	protected Cavum getCavumDist() {
		return cavumDist;
	}
	public void setCavumDist(Cavum cavumDist) {
		this.cavumDist = cavumDist;
	}
	public StenosisValve getStenosis() {
		return stenosis;
	}
	public void setStenosis(StenosisValve stenosis) {
		this.stenosis = stenosis;
	}
	public Regurgitation getRegurgitation() {
		return regurgitation;
	}
	public void setRegurgitation(Regurgitation regurgitation) {
		this.regurgitation = regurgitation;
	}
	
	
	
	
	
}
