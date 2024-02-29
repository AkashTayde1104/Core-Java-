package com.programs.string;

import java.util.Arrays;

//both string contain same character but in different order
public class AnagramString {
	
	public static void main(String[] args) {
		 String s1="Grab";
		 String s2="Brag";
		 
		 s1=s1.toLowerCase();
		 s2=s2.toLowerCase();
		 
		 if(s1.length()!=s2.length())
		 {
			 System.out.println("Not anagram String");
		 }
		 
		 else
			 
		 {
			 char[] c1 = s1.toCharArray();
			 char[] c2 = s2.toCharArray();
			 
			 Arrays.sort(c1);//sort in asscending order
			 Arrays.sort(c2);
			 
			 if(Arrays.equals(c1, c2)==true)// array of char is same then return true
			 {
				 System.out.println("both are anagram string");
			 }
			 else
			 {
				System.out.println("both not anagram string");
			 }
		 }
		 
	}

}
