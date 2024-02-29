package com.toString_method;

public class ex2 {
	
	@Override
	public String toString()
	{
		System.out.println("tostring method called");
		return "tostring of ex2 class";
	}
	
	public static void main(String[] args) {
		ex2 e=new ex2();
		System.out.println(e.toString());
	}

	
}
