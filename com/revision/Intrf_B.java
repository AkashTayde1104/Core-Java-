package com.revision;

public class Intrf_B implements Intrf_A{

	@Override
	public void m1() {
		System.out.println("m1");
	
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}
	
	public static void main(String[] args) {
		
		Intrf_B b1=new Intrf_B();
		b1.m1();
		b1.m2();
		System.out.println(b1.x);
		
	}

}
