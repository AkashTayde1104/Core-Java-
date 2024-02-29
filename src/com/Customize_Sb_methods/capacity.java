package com.Customize_Sb_methods;
//capacity of string or how many char present in string
public class capacity {
	int i;
	int count=0;
	capacity(String s)
	{
		for(int i=0;i<=s.length();i++)
		{
			this.i=count++;
		}
		
		
	}
	public int capacity()
	{
		return i;
		
	}
	public static void main(String[] args) {
		capacity c=new capacity("hello java");
		System.out.println(c.capacity());
				
	}
	

}
