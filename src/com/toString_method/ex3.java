package com.toString_method;

public class ex3 {
	
	
	@Override
	public String toString() 
	{
		int x=10;
		int y=20;
		int c=x+y;
		System.out.println("addition of x & y=" +c);
		return "c";
	}

	public static void main(String[] args) {
		
	ex3 e=new ex3();
	System.out.println(e);
	}

}
