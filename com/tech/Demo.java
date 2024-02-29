package com.tech;

public class Demo {
	static int x=10;
	{
		x=20;
		System.out.println(x);
		this.m1();
	}
	static void m1()
	{
		System.out.println("Class Demo m1() called");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Demo d=new Demo();
	}

}
