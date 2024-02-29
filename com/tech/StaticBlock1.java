package com.tech;

public class StaticBlock1 {
	int x=10;
	static int y=20;
	static
	{
		 StaticBlock1 s1=new  StaticBlock1();
		 s1.m1();
		 System.out.println("inside static block");
		 //System.out.println(y);
	}
	void m1()
	{
		System.out.println("inside m1()");
		
	}
	{
		System.out.println("inside instance block");
		//System.out.println(x);
	}
	public static void main(String[] args) {
		 StaticBlock1 s1=new  StaticBlock1();
		 System.out.println("inside main");
	}

}
