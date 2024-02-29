package com.polymorphism;
//There is no restriction for modifiers and return types
public class Rule_5 {
	
	private int m1()
	{
			System.out.println("No args m1() called");
			return 100;
		}
		public void m1(int x)
		{
		     System.out.println("Int type m1() called");
		     }
		
		public static final void m1(int x, int y)
		{
		     System.out.println("final and static m1() called");
		     
		}
		
		public static void main(String[] args) 
		{
			Rule_5 r=new Rule_5();
			int x=r.m1();
			r.m1(56);
			r.m1(12 , 23);
			System.out.println(x);
		}
	

}
