package com.constructor;
//get error at runtime
public class Recursive_method_calling {
	
	public void m1()
	{
		this.m2();
		System.out.println("m1");
		
	}
	public void m2()
	{
		this.m1();
		System.out.println("m2");
	}
	public static void main(String[] args) {
		Recursive_method_calling r=new Recursive_method_calling();
		
		r.m1();
	}

}
