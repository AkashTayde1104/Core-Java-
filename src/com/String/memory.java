package com.String;

public class memory {
	public static void main(String[] args) {
		String s1=new String("200");
		s1.concat("tech");
		String s2=s1.concat("solution");
		s2.concat("java");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("-----------for string buffer--------");
		
		StringBuffer s3=new StringBuffer("200");//200
		s3.append("tech");//200tech
		System.out.println(s3);//200tech
		StringBuffer s4=s3.append("solution");//200techsolution(existing s1 object change)
		s4.append("java");//200techsolutionjava
		System.out.println(s3);
		System.out.println(s4);
	}

}
