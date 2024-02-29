package com.String;

public class String_methods {
	public static void main(String[] args) {
		String s3=new String("      hello");
		String s=new String("hello");
		String s1=new String("hello");
		String s2=new String("HELLO");
		System.out.println(s.charAt(2));
		System.out.println(s.concat(" java"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 5));
		System.out.println(s.length());
		System.out.println(s.replace('h','H'));
		System.out.println(s2.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s3.trim());
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.lastIndexOf('o'));
		
		
	}

}
