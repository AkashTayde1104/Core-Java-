package com.revision;

public  abstract class Abstract_A {
	int x=10;
	int y=20;
	int c;
	
	public static void m1()
	{
		System.out.println("static m1");
	}
	public abstract void m2();
	
	public Abstract_A()
	{
		c=x+y;
		System.out.println("c="+c);
	}
	
	public Abstract_A(int x,int y)
	{
		c=x-y;
		System.out.println("c="+c);
	}

}
