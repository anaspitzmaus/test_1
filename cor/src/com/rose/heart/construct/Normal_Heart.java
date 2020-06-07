package com.rose.heart.construct;

import com.rose.artery.Aorta;
import com.rose.heart.Heart;
import com.rose.heart.structures.AV_Valve;
import com.rose.heart.structures.Cavum;
import com.rose.heart.structures.LVWall;
import com.rose.heart.structures.LeftAtrium;
import com.rose.heart.structures.LeftVentricle;
import com.rose.heart.structures.RightAtrium;
import com.rose.heart.structures.RightVentricle;
import com.rose.heart.structures.SL_Valve;


public class Normal_Heart extends Heart implements Cloneable{
	
	
	public void createSystolicState() {
		heartSys = (Normal_Heart)clone();
	}
	
	public void createDiastolicState() {
		heartDia = (Normal_Heart)clone();
	}
	
	public Normal_Heart getSystolicState() {
		return this.heartSys;
	}
	
	public Normal_Heart getDiastolicState() {
		return this.heartDia;
	}
	
	private Normal_Heart heartSys, heartDia;
	
	public Normal_Heart() {
		LA = new LeftAtrium("Linker Vorhof");
	}
	

	public void build(){
		
		lvWall = new LVWall();
		
		LA = new LeftAtrium("Linker Vorhof");
		RA = new RightAtrium("Rechter Vorhof");
		LV = new LeftVentricle("Linker Ventrikel");
		RV = new RightVentricle("Rechter Ventrikel");
		
		LV.setWall(lvWall);
		
		MV = new AV_Valve();
		TV = new AV_Valve();
		AV = new SL_Valve();
		PV = new SL_Valve();
		
		MV.setCavumProx(LA);
		MV.setCavumDist(LV);
		
		TV.setCavumProx(RA);
		TV.setCavumDist(RV);
		
		AV.setCavumProx(LV);
		
		PV.setCavumProx(RV);	
		
		aorta = new Aorta();
		
		
		
	}
	
	/**
	 * sets the distal connected cavum of the aortic valve
	 * @param cavum
	 */
	public void setDistalCavumOfAorticValve(Cavum cavum){
		this.AV.setCavumDist(cavum);
	}
	
	/**
	 * sets the distal connected cavum of the pulmonary valve
	 * @param cavum
	 */
	public void setDistalCavumOfPulmonaryValve(Cavum cavum){
		this.PV.setCavumDist(cavum);
	}
	
	@Override
	public Object clone() {
	    Normal_Heart heart = null;
	    try {
	       heart = (Normal_Heart) super.clone();
	    } catch (CloneNotSupportedException e) {
	        heart = new Normal_Heart();
	          
	    }
	   
	    return heart;
	}
}
