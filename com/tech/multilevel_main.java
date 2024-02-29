package com.tech;

public class multilevel_main {
	public static void main(String[] args) {
		multilevel_A a=new multilevel_A();
		a.m1();
		a.m2();
		System.out.println(a.x);
		
		System.out.println();
		System.out.println("...for class multilevel_B");
		
		multilevel_B b=new multilevel_B();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.x);
		System.out.println(b.y);
		
		System.out.println();
		System.out.println("...for class multilevel_C");
		
		multilevel_C c=new multilevel_C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println(c.x); //class A x variable has been Override
		System.out.println(c.y);
		
		System.out.println();
		System.out.println("...for class multilevel_D");
		
		multilevel_D d=new multilevel_D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m5();
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
	}

}
