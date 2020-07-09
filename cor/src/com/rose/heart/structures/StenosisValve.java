package com.rose.heart.structures;

import com.rose.cvs.Stenosis;

public class StenosisValve extends Stenosis{
	Double area;
	Integer grading;
	Valve valve;
	
	/**
	 * the stenotic valve
	 * @return
	 */
	public Valve getValve() {
		return valve;
	}

	public Double getArea() {
		return area;
	}

	/**
	 * set the opening area of the valve
	 * @param area
	 */
	public void setArea(Double area) {
		this.area = area;
	}

	/**
	 * grading of stenosis as string
	 * @return the grading of stenosis
	 */
	public Integer getGrading() {
		return grading;
	}

	public void setGrading(Integer grading) {
		this.grading = grading;
	}

	public StenosisValve(Valve valve) {
		this.valve = valve;
	}
}
