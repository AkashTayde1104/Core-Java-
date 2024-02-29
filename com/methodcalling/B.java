package com.methodcalling;

public class B {
	public void m1()
	{
		System.out.println("M1 start");
		this.m2();
		System.out.println("M2 end");
	}
	public void m2()
	{
		System.out.println("M2 start");
	}
public static void main(String[] args) {
	System.out.println("main start");
	B b=new B();
	b.m1();
}
}
