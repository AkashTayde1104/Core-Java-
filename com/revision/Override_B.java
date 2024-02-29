package com.revision;

public class Override_B extends Override_A {
	@Override
	public void m1()
	{
		System.out.println("m1");
	}
	@Override
	public String m2()
	{
		System.out.println("m2");
		return "Hello";
	}
	@Override
	public String m3()
	{
		System.out.println("m3");
		return "obj";
	}
	
	public static void main(String[] args) {
		 Override_B b=new  Override_B();
		 b.m1();
		 b.m2();
		 b.m3();
	}

}
