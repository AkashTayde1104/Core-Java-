package com.overriding;

public class Rule_5_child extends Rule_5 {

	public static void m1()
	{
		System.out.println("m1() child static method");
	}
	
	public static void main(String[] args) {
		//Rule_5_child.m1();
		//or
		Rule_5_child c=new Rule_5_child();
		c.m1();
		Rule_5.m1();
	}
	
	

}
