package com.StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Abhay SIngh")
	private String Studentname;
	@Value("BikramGanj")
	private String city;
	
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [Studentname=" + Studentname + ", city=" + city + "]";
	}
	
	
}
