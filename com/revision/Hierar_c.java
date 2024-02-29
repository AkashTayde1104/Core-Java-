package com.revision;

public class Hierar_c extends Hiera_A {
	@Override
	public void m4()
	{
		System.out.println("mobile:5");
	}
	public static void main(String[] args) {
		
//		Hiera_A a=new Hiera_A();
//		a.m1();
//		a.m2();
//		System.out.println("____________________________");
//		Hierar_B b=new Hierar_B();
//		b.m1();
//		b.m2();
//		b.m3();
//		System.out.println("________________________");
//		 Hierar_c c=new  Hierar_c();
//		 c.m1();
//		 c.m2();
//		 c.m4();
		A a=new A();
		a.m1();
		a.m2();
		System.out.println("____________________________");
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		System.out.println("____________________________");
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		System.out.println("____________________________");
		Hiera_A a1=new Hiera_A();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
		a1.m5();
		a1.m6();
		a1.m7();
		System.out.println("____________________________");
		Hierar_B b1=new Hierar_B();
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		b1.m5();
		b1.m6();
		b1.m7();
		System.out.println("____________________________");
		 Hierar_c c1=new  Hierar_c();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		c1.m5();
		c1.m6();
		c1.m7();
		
		
		
		
	}

}
