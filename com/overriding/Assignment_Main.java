package com.overriding;

public class Assignment_Main {
	public static void main(String[] args) {
		
		Assignment_A a=new Assignment_A();
		a.m1();
		a.m2();
		System.out.println(a.x);
		
		System.out.println("......for B class......");
		
		Assignment_B b=new Assignment_c();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.x);
		System.out.println(b.y);
		
		System.out.println(".......For C class........ ");
		
		Assignment_c c=new Assignment_c();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		
		System.out.println(".....for D class......");
		
		Assignment_D d=new Assignment_D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m5();
		d.m6();
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		
		System.out.println(".........for E class.......");
		
		Assignment_E e=new Assignment_E();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		e.m6();
		System.out.println(e.p);
		System.out.println(e.x);
		System.out.println(e.y);
		System.out.println(e.z);
	}

}
