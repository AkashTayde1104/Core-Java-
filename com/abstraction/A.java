package com.abstraction;
// abstract class for constructor
public abstract class A {
	 static int x;
	static int y;
	char c;
	public A(int x, int y)
	{
		this.x=x;
		this.y=y;
		
		System.out.println(this.x);
		System.out.println(this.y);
	}

}
