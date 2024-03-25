package com.Ambiguity_problem_CI;

public class Addition {

	private int A;
	private int B;
	
	
	public Addition(double A,double B) {
		this.A=(int)A;
		this.B=(int)B;
		System.out.println("construction : double,double");
	}
	public Addition(int A,int B) {
		this.A=A;
		this.B=B;
		System.out.println(" construction : int , int");
	}
	public Addition(String A,String B) {
		this.A=Integer.parseInt(A);
		this.B=Integer.parseInt(B);
		System.out.println(" construction : String , String");
	}


	public void doSum() {
		System.out.println("this sum "+(this.A+this.B));
	}
}
