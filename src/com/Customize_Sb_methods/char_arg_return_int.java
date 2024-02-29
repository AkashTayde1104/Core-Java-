package com.Customize_Sb_methods;
public class char_arg_return_int {
	String s="Hello";
	int i;
	char_arg_return_int(char ch)
	{
		if(ch=='H')
		{
			this.i=0;
		}
		else if(ch=='e')
		{
			this.i=1;
		}
		else if(ch=='l')
		{
			this.i=2;
		}
		else if(ch=='l')
		{
			this.i=3;
		}
		else if(ch=='o')
		{
			this.i=4;
		}
		else
		{
			System.out.println("String Out Of Bound Exception");
		}
	}
	public int index()
	{
		return i;
	}
	public static void main(String[] args) {
		char_arg_return_int c=new char_arg_return_int('e');//pass char return index
		System.out.println(c.index());
	}

}
