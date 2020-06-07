package com.rose.heart.structures;

public class LVWall extends Wall{

	public LVWall() {
		Part anterior = new Part("anterior");
		Part posterior = new Part("posterior");
		Part septal = new Part("septal");
		Part anteroseptal = new Part("anteroseptal");
		Part inferior = new Part("inferior");
		Part lateral = new Part("lateral");
		
		getParts().add(anterior);
		getParts().add(anteroseptal);
		getParts().add(septal);
		getParts().add(inferior);
		getParts().add(posterior);
		getParts().add(lateral);
		
		
		getPart("anterior").getSubParts().add(new SubPart("basal"));
		getPart("anterior").getSubParts().add(new SubPart("medial"));
		getPart("anterior").getSubParts().add(new SubPart("apikal"));
		
		
		getPart("septal").getSubParts().add(new SubPart("basal"));
		getPart("septal").getSubParts().add(new SubPart("medial"));
		getPart("septal").getSubParts().add(new SubPart("apikal"));
		
		
		
	}
}
