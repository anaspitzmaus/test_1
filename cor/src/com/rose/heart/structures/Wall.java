package com.rose.heart.structures;

import java.util.ArrayList;
import java.util.LinkedList;


public class Wall implements Cloneable, IMeasurableStructure{
	LinkedList<Part> parts;
	
	public LinkedList<Part> getParts(){
		return this.parts;
	}
	
	public Wall() {
		parts = new LinkedList<Part>();
	}
	
	/**
	 * get the part with a given notation (String)
	 * @param notation
	 * @return the Part with the given notation
	 */
	public Part getPart(String notation) {
		if(parts instanceof LinkedList) {
			for(Part p:parts) {
				if(p.getNotation().equals(notation)) {
					return p;
				}
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<? extends Measurement> getMeasurements() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public class Part implements IMeasurableStructure{
		LinkedList<SubPart> subParts;
		Double width;
		String name;
		
		public Part(String name) {
			this.name = name;
			subParts = new LinkedList<SubPart>();
		}
		
		public String getNotation() {
			return this.name;
		}
		
		public void setWidth(Double width) {
			this.width = width;
		}
		
		public Double getWidth() {
			return this.width;
		}
		
		public LinkedList<SubPart> getSubParts(){
			return this.subParts;
		}
		
		public SubPart getSubPart(String notation) {
			if(subParts instanceof LinkedList) {
				for(SubPart sp:subParts) {
					if(sp.getNotation().equals(notation)) {
						return sp;
					}
				}
			}
			return null;
		}

		@Override
		public ArrayList<? extends Measurement> getMeasurements() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}
	
	public class SubPart implements IMeasurableStructure{
		Double width;
		String name;
		
		public SubPart(String name) {
			this.name = name;
		}
		
		public String getNotation() {
			return this.name;
		}
		
		public void setWidth(Double width) {
			this.width = width;
		}
		
		public Double getWidth() {
			return this.width;
		}

		@Override
		public ArrayList<? extends Measurement> getMeasurements() {
			// TODO Auto-generated method stub
			return null;
		}
	}

	

	
}
