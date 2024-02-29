package com.tech;

public class Practice {
	// can we declare local and global var in static method
	static int x=5;
	public static void m1()
	{
		int y=7;
		System.out.println(y);
		System.out.println(x);
		
	}
	
	public void m2()
	{
		//x=10;
		
		
	}
	public static void main(String[] args) {
		Practice.m1();
		System.out.println(x);
		
		Practice p=new Practice();
	   System.out.println(p.x);
	   
	   Practice p1=new Practice();// we can store same variable in different object
	   System.out.println(p1.x);
	}

}
