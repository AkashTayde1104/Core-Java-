package com.String;

public class Test {
	public static void main(String[] args) {
		String s1=new String("welcome");
		s1.concat("to");
		String s2=s1.concat("java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	
		String s3=new String("Good");
		s3.concat("morning");
		String s4=new String("Tech");
		s4.concat("solution");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
	}

}
