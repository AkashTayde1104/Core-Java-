package com.String;

public class constructor {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		
		String s=new String(sb);
	
		System.out.println(s);//convert stringbuffer to string
		
		
		
		char ch[]= {'a', 'b', 'c'};
		String s1=new String(ch);
		System.out.println(s1);//convert char[] to string
	}

}
