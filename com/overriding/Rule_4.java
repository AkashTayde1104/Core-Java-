package com.overriding;
//in method overriding access modifier must be same or its greater scope
public class Rule_4 {
	protected Rule_4 m1()
	{
		System.out.println("parent m1() method called");
		return new Rule_4();
	}

}
