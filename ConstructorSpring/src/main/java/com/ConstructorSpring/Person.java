package com.ConstructorSpring;

public class Person {

	private String name;
	private int PersonId;
	
	public Person(String name, int personId) {
		
		this.name = name;
		PersonId = personId;
	}

	@Override
	public String toString() {
		
		return this.name+":"+this.PersonId;
	}
	
	
}
