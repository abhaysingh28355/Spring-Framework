package com.implementingLifeCycleMethod;

public class Mango {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Mango(double price) {
		super();
		this.price = price;
	}

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mango[Price"+price+"]";
	}
	public void init() {
		System.out.println("Inside the method");
	}
	public void destroy() {
		System.out.println("outside the method");
	}
	

}
