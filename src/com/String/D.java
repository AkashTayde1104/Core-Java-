package com.String;

public class D {
	public static void main(String[] args) {
		
		System.out.println("-----String hold any type of data type-------");
		char c='c';
		char ch[]= {'a', 'b', 'c', 'd'};
		System.out.println(ch);
		String s="abcd";
		System.out.println(c);
		System.out.println(s);
		
		
	System.out.println();
	System.out.println("-----String-----   and == OPERATOR in String-------");
	
		String s1=new String("tech");
		String s11=s1.concat(" solution");//concatenation in string
		System.out.println(s11);
		String s2=new String("tech");
		String s3=new String("TECH");
		System.out.println(s1==s2);// == operator use for reference comparison
		
		System.out.println();
		System.out.println("-----Equals method in String------");
		System.out.println(s1.equals(s2));//override object class equal method for content comparison
		System.out.println(s1.equals(s3));//becoz string is case sensitive
		
		System.out.println();
		System.out.println("----stringBuffer----- and == OPERATOR in StringBuffer");
		StringBuffer sb=new StringBuffer("tech");
		StringBuffer sb1=new StringBuffer("tech");
		StringBuffer sb2=sb;
		System.out.println(sb==sb1);// == operator use for reference comparison
		System.out.println(sb==sb2);
		sb.append("solution");//concatenation in StringBuffer
		System.out.println(sb);
		System.out.println();
		
		System.out.println("----Equals method in StringBuffer---");
		System.out.println(sb.equals(sb1));//reference comparison(directly used object class equal())
		System.out.println(sb.equals(sb2));
	}

}
