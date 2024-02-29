package com.overriding;

public class Rule_4_child extends Rule_4 {
	@Override
	public Rule_4_child m1()
	{
		System.out.println("child m1() called");
		return new Rule_4_child();
	}
	
	public static void main(String[] args) {
		Rule_4_child c=new Rule_4_child();
		c.m1();
	}

}
