package com.programs.string;

public class Swap_Strings {
	public static void main(String[] args) {
//		String s1="abc";
//		String s2="xyz";
		
		String s1="Hello";//length=5
		String s2="Java";//length=4
		
		System.out.println("Before swapping s1 = "+s1 +" and s2 = "+s2);
//		String Temp;
//		Temp=s;
//		s=s1;
//		s1=Temp;
//		
		s1=s1+s2;//s1="abcxyz", s1=HelloJava(length=9)
		
//		        s2=      s1(  0,       9       -    4) i.e s1(0,5)...s2="Hello"
		s2=s1.substring(0, (s1.length()-s2.length()));//s2=s1(0,(6-3)); i.e s2=s1(0,3) start index to end-1 index
		                                              //s2="abc";
		
		
//		s1=s1(5); s1=Java
		s1=s1.substring(s2.length());//s1=s1(3) (length count from updated s2)start from 3rd index  i.e s1=xyz
		
		
		System.out.println("After swaping s1 = "+s1 + " and s2 = "+s2);
		
		
		
		
	}

}
