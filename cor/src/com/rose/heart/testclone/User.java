package com.rose.heart.testclone;

public class User implements Cloneable {

	private String firstName;
    private String lastName;
    private Address address;
	protected String getFirstName() {
		return firstName;
	}
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	protected String getLastName() {
		return lastName;
	}
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	protected Address getAddress() {
		return address;
	}
	protected void setAddress(Address address) {
		this.address = address;
	}
    
	public User(User that) {
	    this(that.getFirstName(), that.getLastName(), new Address(that.getAddress()));
	}
	public User(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public Object clone() {
	    User user = null;
	    try {
	        user = (User) super.clone();
	    } catch (CloneNotSupportedException e) {
	        user = new User(
	          this.getFirstName(), this.getLastName(), this.getAddress());
	    }
	    user.address = (Address) this.address.clone();
	    return user;
	}
	
	
}
