package com.programs.string;

public class TotalNoOfCharctersInString {
	public static void main(String[] args) {
		String s="Hello I am from pune";
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total String Characters = "+count);
	}

}
