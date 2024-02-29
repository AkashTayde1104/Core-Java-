package com.Customize_Sb_methods;
public class intarg_return_char {
	char ch;
	String s="Hello";
	intarg_return_char(int i)
	{
		if(i==0)
		{
			this.ch='H';
		}
		else if(i==1)
		{
			this.ch='e';
		}
		else if(i==2)
		{
			this.ch='l';
		}
		else if(i==3)
		{
			this.ch='l';
		}
		else if(i==4)
		{
			this.ch='0';
		}
		else
		{
			System.out.println("String Out Of Bound Exception");
		}
	}
	public char character()
	{
		return ch;
	}
      public static void main(String[] args) {
		intarg_return_char c=new intarg_return_char(1);//pass int return char
		System.out.println(c.character());
		
	}
}

