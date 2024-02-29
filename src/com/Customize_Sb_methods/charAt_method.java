package com.Customize_Sb_methods;

public class charAt_method {
	char ch;
	
	charAt_method(char ch)
	{
		this.ch=ch;
	}
	public char character()
	{
		return ch;
	}
	public static void main(String[] args) {
		
		
		charAt_method c=new charAt_method('h');
		System.out.println(c.character());
	}
	

}
