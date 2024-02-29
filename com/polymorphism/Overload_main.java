package com.polymorphism;
//we can overload main method but argument must be different
public class Overload_main {
	public static void main(char c)
	{
		System.out.println("Overloaded main");
	}
	
	public static void main(char c, int x)
	{
		System.out.println("char-int Overloaded main");
	}
	public static void main(String[] args) {
		Overload_main ov=new Overload_main();
		ov.main('v');
		
		//or
		Overload_main.main('d', 34);
		
	}

}
