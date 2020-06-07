package com.rose.heart.testclone;

public class Address implements Cloneable{
	 private String street;
	    private String city;
	    private String country;
		protected String getStreet() {
			return street;
		}
		protected void setStreet(String street) {
			this.street = street;
		}
		protected String getCity() {
			return city;
		}
		protected void setCity(String city) {
			this.city = city;
		}
		protected String getCountry() {
			return country;
		}
		protected void setCountry(String country) {
			this.country = country;
		}
	    
	    
		public Address(Address that) {
		    this(that.getStreet(), that.getCity(), that.getCountry());
		}
		
		public Address(String street, String city, String country) {
			this.street = street;
			this.city = city;
			this.country = country;
		}
		
		@Override
		public Object clone() {
		    try {
		        return (Address) super.clone();
		    } catch (CloneNotSupportedException e) {
		        return new Address(this.street, this.getCity(), this.getCountry());
		    }
		}
	
	
}
