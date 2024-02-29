package com.constructor;

public class constr_using_super_this extends constr_using_super_this_parent {
	
	int x=200;
	public constr_using_super_this()
	{
		this('c');
		System.out.println("child non para constructor");
	}
	
	public constr_using_super_this(char c)
	{
		super(100);
		System.out.println("child para constructor");
	}
	
	public void m1()
	{
		System.out.println("value of x=" +x);
		System.out.println("value of x="+super.x);
	}
	public static void main(String[] args) {
		constr_using_super_this c=new constr_using_super_this();
		c.m1();
	}
}
