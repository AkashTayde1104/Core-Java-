package com.polymorphism;

public class Final_class_2 extends Final_class
{
	
	/*public final void m1()
	{
		
		System.out.println("no args m1()");
	}*/ // can't override final m1 method
	
	public void m1(int x, int y) 
	{
		//int x=20;// cannot reassign final variable
		System.out.println("int type m1()");
		
	}
	
	public static void main(String[] args) {
		Final_class_2 f=new Final_class_2();
		f.m1();
		f.m1(10, 20);
		System.out.println(f.x);
	}
	
}
