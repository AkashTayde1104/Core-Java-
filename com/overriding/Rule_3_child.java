package com.overriding;

public class Rule_3_child extends Rule_3 {
	@Override
    public String m1()
    {
	System.out.println("m1() child method");
	return "Hello";
}
	@Override
	public int m2()
	{
		System.out.println("m2() child method");
		return 5;
	}
	public static void main(String[] args) {
		Rule_3_child c=new Rule_3_child();
		c.m1();
		c.m2();
	}
}
