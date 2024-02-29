package com.own.practiceprograms;

import java.util.Scanner;

//the number which is same after reverse 121 = 121

public class Palindrome_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, s=0, c, r;
		System.out.println("enter num");
		n=sc.nextInt();
		
		c=n;
		
		while(n>0)
		{
			r=n%10;//r=1, r=2 , r=1
			s=(s*10)+r; //s=1, s=12, s=121
			n=n/10; //n=12, n=1, n=0
		}
		if(c==s)
		{
			System.out.println("num is palindrome");
		}
		else
		{
			System.out.println("num is not palindrome");
		}
		
	}

}
