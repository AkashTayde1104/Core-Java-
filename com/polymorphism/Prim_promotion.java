package com.polymorphism;
// primitive_data_promotion
public class Prim_promotion {
	public void m1(char c) 
	{
		System.out.println("char type args m1()");
	}

	
	public void m1(int i)
	{
		System.out.println("int type args m1()");
	}
	
	
	public void m1(long l)
	{
		System.out.println("long type args m1()");
	}
	
	
	public void m1(float f)
	{
		System.out.println("float type args m1()");
	}
	
	public void m1(double d)
	{
		System.out.println("double type args m1()");
	}
	
	public static void main(String[] args) {
		Prim_promotion p=new Prim_promotion();
		p.m1('c');
	}

}
