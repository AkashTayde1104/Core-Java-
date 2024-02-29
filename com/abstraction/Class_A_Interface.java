package com.abstraction;

public class Class_A_Interface implements Intrf,Intrf2 {

	@Override
	public void m1() {
		System.out.println("m1() called");
		
	}
	public static void main(String[] args) {
		Class_A_Interface c=new Class_A_Interface();
		c.m1();
	}

}
