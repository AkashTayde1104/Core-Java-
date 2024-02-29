package com.methodcalling;

public class D {
	public void m1()
	{
		System.out.println("M1 start");
		this.m3();
		System.out.println("M1 end");
	}
	public void m2()
	{
		System.out.println("M2 start");
		this.m1();
		System.out.println("M2 End");
	}
	public void m3()
	{
		System.out.println("M3 satrt");
		System.out.println("M3 End");
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		D d=new D();
		d.m2();
		System.out.println("Main End");
	}

}
