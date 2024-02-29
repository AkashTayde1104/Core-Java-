package com.own.practiceprograms;

import java.util.Scanner;

// next number is sum of previous two number 0, 1, 1, 2, 3, 5, 8, 13
public class Fibonacci_Series {
	public static void main(String[] args) {
//		int n1=0;
//	    int n2=1;
//	    int n3,i,count=11;
//	    System.out.println(n1);
//	    System.out.println(n2);
//	    for(i=2;i<count;i++)
//	    {
//	    	n3=n1+n2;
//	    	System.out.println(n3);
//	    	n1=n2;
//	    	n2=n3;
//	    	
//	    }
		
		Scanner sc=new Scanner(System.in);
		int term, a=0, b=1, c;
		
		System.out.println("Enter num");
		term=sc.nextInt();
		
		for(int i=1;i<=term;i++)
		{
			System.out.println(a);//a=0, a=1, a=1, a=2, a=3, a=5, a=8.......etc
			c=a+b;//c=1, c=2, c=3, c=5, c=8, c=13
			a=b;//a=1, a=1, a=2, a=3, a=5, a=8
			b=c;//b=1, b=2, b=3, b=5, b=8, b=13
		}
	
	}

}
