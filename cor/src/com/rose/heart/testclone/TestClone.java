package com.rose.heart.testclone;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestClone {

	public static void main(String[] args) {
		whenModifyingOriginalObject_thenCloneCopyShouldNotChange();
		Address address = new Address("Downing St 10", "London", "England");
	    User pm = new User("Prime", "Minister", address);
	    User deepCopy = new User(pm);
	 
	    address.setCountry("Great Britain");
	  

	}
	
	public static void whenModifyingOriginalObject_thenCloneCopyShouldNotChange() {
	    Address address = new Address("Downing St 10", "London", "England");
	    User pm = new User("Prime", "Minister", address);
	    User deepCopy = (User) pm.clone();
	 
	    address.setCountry("Great Britain");
	 
	  
	   assertNotEquals(pm.getAddress().getCountry(), deepCopy.getAddress().getCountry());
	    
	}
	
	

}
