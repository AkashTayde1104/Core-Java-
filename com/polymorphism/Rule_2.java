package com.polymorphism;
//we can overload constructor as well as method

public class Rule_2 {
	public Rule_2()
	{
		System.out.println("Non-paramaterised constructor");
	}
	
	public Rule_2(int x)
	{
		System.out.println("Paramaterised constructor");
	}
	
	public static void main(String[] args) {
		Rule_2 r=new Rule_2();//constructor called at the time of object creation
		Rule_2 r1=new Rule_2(10);
	}

	
}
