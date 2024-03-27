package com.SpringExpressionLangaugeSPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{11+12}")
	private int a;
	@Value("#{11*12}")
	private int b;
	@Value("#{T(java.lang.Math).sqrt(8)}")
	private double z;
	@Value("#{new java.lang.String('Abhay Singh')}")
	private String name;
	@Value("#{3>8}")
	private boolean isActive;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}

	
	
	
	

}
