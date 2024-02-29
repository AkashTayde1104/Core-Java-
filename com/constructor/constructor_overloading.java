package com.constructor;

public class constructor_overloading {

	public constructor_overloading()
	{
		System.out.println("non para constructor");
	}
	
	public constructor_overloading(char c)
	{
		System.out.println("char type constuctor");
	}
	
	public constructor_overloading(int x)
	{
		System.out.println("int type constructor");
		
	}
	
	public constructor_overloading(String s)
	{
		System.out.println("string type constructor");
	}
	public static void main(String[] args) {
		constructor_overloading c=new constructor_overloading();
		
		constructor_overloading c1=new constructor_overloading(10);
		
		constructor_overloading c2=new constructor_overloading('c');
		
		constructor_overloading c3=new constructor_overloading("Hello");
		
	}
}
