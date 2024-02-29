package com.programs.string;


// == operator use for reference comparison 
// equalas method use for contain comparioson
public class Demo {
	public static void main(String[] args) {
//		String s="rahul";
//		String s1="rahul";
////		String s1="ram";
//
//		String s2="Rahul";
//		System.out.println(s.equalsIgnoreCase(s2));
//		System.out.println(s==s1);// return true bcoz store in scp same content but diff refe store in one obj
//		System.out.println(s.equals(s1));//string is case sensitive
//		
//		String s3=new String("rahul");
//		String s4=new String("rahul");
//		System.out.println(s3==s4);//return false bcox it store in heap and for every near keyword store in sepaarete obj
//		System.out.println(s3.equals(s4));
		
		
		
		//count number of digits in integer
		int i=12345;
		//1st approach
//		int count=0;
//		while(i>0)
//		{
//			count++;
//			
//			i=i/10;
//		}
//		System.out.println(count);
		
		//or 2nd approch using string method
		String s = Integer.toString(i);
		System.out.println(s.length());
		
	}
	

}
