package com.programs.string;

public class CheckLettersOnly {
	public static void main(String[] args) {
//		String s="Hello1";
		String s="Hello";
		
		int count=0;
		String letter="";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(!Character.isLetter(c))
			{
				count++;
			}
			else
			{
				letter=letter+c;
			}
		}
		
		if(count==0)
		{
			System.out.println("contains letter only"); 
		}
		else
		{
			System.out.println("not contains letter only");
		}
	}

}
