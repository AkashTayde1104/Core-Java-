package com.tech;

public class HAS_A_2 {
	public void m4()
	{
		System.out.println("m4() called");
	}
	public static void main(String[] args) {
		HAS_A a=new HAS_A();
		a.m1();
		a.m3();
		
		HAS_A_2 a2=new HAS_A_2();
		a2.m4();//in HAS-A we can get only part of properties
	}

}
