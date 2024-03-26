package com.AutowiringUsingXML;

public class Address {

	private String Stress;
	private String city;
	
	
	public String getStress() {
		return Stress;
	}
	public void setStress(String stress) {
		Stress = stress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		System.out.println("inside the construction");
	}

	@Override
	public String toString() {
		return "Address [Stress=" + Stress + ", city=" + city + "]";
	}
	
	
}
