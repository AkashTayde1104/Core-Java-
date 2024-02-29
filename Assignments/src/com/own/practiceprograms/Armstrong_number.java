package com.own.practiceprograms;

import java.util.Scanner;

//a number equal to sum of mth power of their digits 153= 1^3 + 5^3 + 3^3 = 153
public class Armstrong_number {
	
	public static void main(String[] args) {
		int n, arm=0, c , r;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		
		while(n>0)
		{
			r=n%10;//r=3, r=5, r=1
			arm=arm + (r*r*r);//find cube of digits and add in arm i.e in 0
			n=n/10;//n=15 , n=1, n=0
		}
		if(c==arm)
		{
			System.out.println("this is armstrong number");
		}
		else
		{
			System.out.println("this is not armstrong number");
		}
		
	}
	

}
