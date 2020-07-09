package com.rose.heart;

import com.rose.artery.Aorta;
import com.rose.heart.structures.AV_Valve;
import com.rose.heart.structures.LVWall;
import com.rose.heart.structures.LeftAtrium;
import com.rose.heart.structures.LeftVentricle;
import com.rose.heart.structures.RightAtrium;
import com.rose.heart.structures.RightVentricle;
import com.rose.heart.structures.SL_Valve;

public class Heart {
	protected LeftAtrium LA;
	protected RightAtrium RA;
	protected LeftVentricle LV;
	protected RightVentricle RV;
	protected AV_Valve MV, TV;
	protected SL_Valve AV, PV;
	protected Aorta aorta;
	protected LVWall lvWall;
	
	//setters and getters
		/**
		 * 
		 * @return the left atrium of the heart
		 */
		public LeftAtrium getLeftAtrium() {
			return this.LA;
		}
		
		/**
		 * 
		 * @return the right atrium of the heart
		 */
		public RightAtrium getRightAtrium() {
			return this.RA;
		}
		
		/**
		 * 
		 * @return the left ventricle of the heart
		 */
		public LeftVentricle getLeftVentricle() {
			return this.LV;
		}
		
		/**
		 * 
		 * @return the right ventricle of the heart
		 */
		public RightVentricle getRightVentricle() {
			return this.RV;
		}
		
		public Aorta getAorta() {
			return this.aorta;
		}
		
		public void setAorta(Aorta aorta) {
			this.aorta = aorta;
		}

		public LVWall getLvWall() {
			return lvWall;
		}
		
		public AV_Valve getMitralValve() {
			return this.MV;
		}
		
		public SL_Valve getAorticValve() {
			return this.AV;
		}
		
		
}
