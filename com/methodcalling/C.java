package com.methodcalling;

public class C {
	public void m2()
	{
		System.out.println("M2 Start");
		System.out.println("M2 End");
	}
	public void m3()
	{
		System.out.println("M3 Start");
		this.m2();
		System.out.println("m3 End");
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		C c=new C();
		c.m3();
		System.out.println("Main End");
	}

}
