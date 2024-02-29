package com.constructor;

public class Default_Constr_Demo extends B {
	
//public Default_Constr_Demo()
//{
//	System.out.println("Default_Constr_Demo called");
//}
	
	public Default_Constr_Demo()
	{
		
		this('a');//Initialized value if parent class constructor is parameterized
		System.out.println("Default_Constr_Demo non-para called");
	}
	
	public Default_Constr_Demo(char c)
	{
		super();
		System.out.println("Default_Constr_Demo  parameterized called");
	}
	public void m1()
	{
		System.out.println("m1() method called");
	}
public static void main(String[] args) {
	Default_Constr_Demo d=new Default_Constr_Demo();// at  the time of object creation constructor called(no need to call default constr)
	d.m1();
}
}
