package com.SpringAutowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int eid;
	private String ename;
	private double salary;
	@Autowired
	private Address addr;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double salary, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.addr = addr;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	

}
