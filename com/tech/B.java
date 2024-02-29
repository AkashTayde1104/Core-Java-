package com.tech;

public class B extends A{
	public void show()
	{
		System.out.println("class B show() called");
	}
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		b.show();
		System.out.println(b.x);
	}

}
