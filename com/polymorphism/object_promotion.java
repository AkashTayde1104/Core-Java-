package com.polymorphism;

public class object_promotion {
	public void m1(Object obj)
	{
		System.out.println("object");
	}
	
	public void m1(String obj)
	{
		System.out.println("String");
	}
	
	public void m1(object_promotion O)
	{
		System.out.println("CLASS OBJECT");
	}
	
	public static void main(String[] args) {
		object_promotion o=new object_promotion();
		o.m1("Hello");
	}
}
