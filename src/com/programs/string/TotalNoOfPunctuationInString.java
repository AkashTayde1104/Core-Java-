package com.programs.string;

public class TotalNoOfPunctuationInString {
	public static void main(String[] args) {
		String s="Hello , i am 'Aishwarya' . I am from Pune !";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==',' || (s.charAt(i)=='.') || s.charAt(i)=='!'|| s.charAt(i)=='\'')
			{
				count++;
			}


		}
		
		System.out.println("Total punctuations = "+count);
	}

}
