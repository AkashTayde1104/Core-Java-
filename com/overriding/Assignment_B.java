package com.overriding;

public class Assignment_B extends Assignment_A {
	int x=10;
	int y=20;
	@Override
	public void m1()
	{
		System.out.println("Class B m1() called");
	}
	@Override
	public void m2()
	{
		System.out.println("Class B m2() called");
	}
	public void m3()
	{
		System.out.println("Class B m3() called");
	}

}
