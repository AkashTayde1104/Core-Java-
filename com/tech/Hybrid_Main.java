package com.tech;

public class Hybrid_Main {
	public static void main(String[] args) {
		/*Hybrid_A a=new Hybrid_A();
		a.m1();
		System.out.println(a.x);
		System.out.println(a.y);
		
		System.out.println("_______________________");
		
		Hybrid_B b=new Hybrid_B();
		b.m1();
		b.m2();
		System.out.println(b.x);
		System.out.println(b.y);
		
		System.out.println("___________________________");
		
		Hybrid_C c=new Hybrid_C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.x);
		System.out.println(c.y);
		
		System.out.println("_______________________");
		
		Hybrid_D d=new Hybrid_D();
		d.m1();
		d.m2();
		d.m3();
		System.out.println(d.x);
		System.out.println(d.y);
		
		System.out.println("______________________________");
		
		Hybrid_E e=new Hybrid_E();
		e.m1();
		e.m2();
		e.m3();
		System.out.println(e.x);
		System.out.println(e.y);*/
		
		System.out.println("Using Parent Reference");
		Hybrid_A a1=new Hybrid_B();
		a1.m1();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println("********************");
		
		Hybrid_B b1=new Hybrid_C();
		b1.m1();
		b1.m2();
		System.out.println(b1.x);
		System.out.println(b1.y);
		
		System.out.println("*********************");
		
		Hybrid_C c1=new Hybrid_D();
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println(c1.x);
		System.out.println(c1.y);
		
		System.out.println("**********************");
		
		Hybrid_C c2=new Hybrid_E();
		c2.m1();
		c2.m2();
		c2.m3();
		System.out.println(c2.x);
		System.out.println(c2.y);
		}

}
