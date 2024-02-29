package com.tech;

public class InstanceBlock {
	static int x=10;
	{
		x=20;
		System.out.println(x);
		System.out.println(this.x);
		
		this.m1();
		
	}
	static void m1()
	{
		System.out.println("class  m1() called");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		InstanceBlock i=new InstanceBlock();
		
	}

}
