package com.polymorphism;
//we can overload private, final and static method as well
public class Rule_4 {
	
		 private static final void m1()
		{
			System.out.println("No args m1() called");
		}
		private static void m1(int x)
		{
		     System.out.println("Int type m1() called");
		     
		}
		
		private void m1(String c, int x)
		{
			System.out.println("String-int type method");
		}
		
		static void m1(char c, String d)
		{
			System.out.println("char-string type method");
		}
		
		final void m1(char c)
		{
			System.out.println("Char type method");
		}

		public static void main(String[] args) {
		  // Rule_4.m1();
	       //Rule_4.m1(10);
			
	       //or
	       
	       Rule_4 r=new Rule_4();
	       r.m1();
	       r.m1(3);
	       r.m1("aishu", 4);
	       r.m1('d', "aishu");
	       r.m1('v');
		}
	
		
	}


