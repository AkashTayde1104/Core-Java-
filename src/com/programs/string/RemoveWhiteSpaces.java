package com.programs.string;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s="Hi Hello How Are You";
		String removedWhiteSpace="";
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isWhitespace(s.charAt(i)))
			{
				removedWhiteSpace=removedWhiteSpace+s.charAt(i);
			}
			
		}
		System.out.println(removedWhiteSpace);
	}

}
