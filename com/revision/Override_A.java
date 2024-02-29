package com.revision;

public class Override_A {
	public void m1()
	{
		System.out.println("m1");
	}
	public String m2()//there is no relation between any datatype
	//thats why we use same return type in child class also
	{
		System.out.println("string m2");
		return "Hello";
		
	}
	
	protected Object m3()
	{
		System.out.println("object");
		return "obj";
	}

}
