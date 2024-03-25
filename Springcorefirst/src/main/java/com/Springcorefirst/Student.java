package com.Springcorefirst;

public class Student {
	
	private int id;
	private String name;
	private int rollno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
//	}
	
	public void display() {
		System.out.println("Student Id"+"="+id +"\n"+"Student Name"+"="+name+"\n"+"Rollno"+"="+rollno);
	}

}
