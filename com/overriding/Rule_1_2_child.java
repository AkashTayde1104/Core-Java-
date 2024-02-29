package com.overriding;

public class Rule_1_2_child extends Rule_1_and_2 {
	@Override
	public void m1(int x) 
	{
		System.out.println("m1 overriden method called");
	}
public static void main(String[] args) {
	Rule_1_2_child c=new Rule_1_2_child();
	c.m1(10);
}
}
