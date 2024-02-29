package com.revision;

public class Promotion {
//	public void m1(byte b)
//	{
//		System.out.println("byte type");
//	}
//	public void m1(short s) 
//	{
//		System.out.println("short type");
//	}
//	public void m1(int i)
//	{
//		System.out.println("int type");
//	}
//	public void m1(long l)
//	{
//		System.out.println("long type");
//	}
//	public void m1(float f)
//	{
//		System.out.println("float type");
//	}
//	public void m1(double d)
//	{
//		System.out.println("double");
//	}
	
	
	public void m1(Object obj)
	{
		System.out.println("object");
	}
//	public void m1(String s)
//	{
//		System.out.println("string");
//	}
//	public void m1(Promotion p)
//	{
//		System.out.println("Promotion class");
//	}
	public static void main(String[] args) {
		Promotion p=new Promotion();
		p.m1("hllo");
	}

}
