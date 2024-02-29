package com.programs.string;

public class StringPrintDigitsOnly {
	public static void main(String[] args) {
	//remove letter
    // print digits only
	
	String s="Hello1234";
	int count=0;
	
	String digits="";
//	String notDigits="";
	for(int i=0;i<s.length();i++)
	{
//		if(Character.isDigit(s.charAt(i)))
		if(!Character.isLetter(s.charAt(i)))
		{
			digits=digits+s.charAt(i);
			
		}
//		else
//		{
//			notDigits=notDigits+s.charAt(i);
//		}
	}
	
	
		System.out.println("print digits : " +digits);
	

}
}