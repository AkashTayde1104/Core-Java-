package com.WrapperClasses;

public class Parsexxx {
	public static void main(String[] args) {
		//String to primitive(static)
		
		String s="100";
		int x=Integer.parseInt(s);
		System.out.println(x);
		
		System.out.println(Byte.parseByte(s));
		System.out.println(Short.parseShort(s));
		System.out.println(Long.parseLong(s));
		
		String s1="12.4";
		System.out.println(Float.parseFloat(s1));
		System.out.println(Double.parseDouble(s1));
		
		String s3="true";
		System.out.println(Boolean.parseBoolean(s3));
		
		
				
	}

}
