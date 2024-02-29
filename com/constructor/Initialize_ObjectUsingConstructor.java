package com.constructor;
//initialize object using constructor
//count for instance block
public class Initialize_ObjectUsingConstructor {
	String name;
	int rollNo;
	int x=10;
	static int count=0;
	public Initialize_ObjectUsingConstructor(String name, int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	public void m1()
	{
		System.out.println(name);
		System.out.println(rollNo);
	}
	{
		count++;
	}
	public static void main(String[] args) {
		Initialize_ObjectUsingConstructor c=new Initialize_ObjectUsingConstructor("Ram",100);
		
		Initialize_ObjectUsingConstructor c1=new Initialize_ObjectUsingConstructor("Rohit",200);
		c1.m1();
		System.out.println("The no of object created="+count);
	}

}
