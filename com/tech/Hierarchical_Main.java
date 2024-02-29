package com.tech;

public class Hierarchical_Main {
	public static void main(String[] args) {
		Hierarchical_A a=new Hierarchical_A();
		a.m1();
		
		System.out.println();
		
		Hierarchical_B b=new Hierarchical_B();
		b.m1();
		b.m2();
		
		System.out.println();
		
		Hierarchical_C c=new Hierarchical_C();
		c.m1();
		c.m2();
		c.m3();
	

}
}