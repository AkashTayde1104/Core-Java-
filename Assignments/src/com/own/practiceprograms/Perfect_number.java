package com.own.practiceprograms;

import java.util.Scanner;

//number which sum of  its perfect divisor which is less than numberr

//6= 1, 2, 3, 4, 5 so 1, 2, 3 is perfect divider of 6 which remainder is 0

//sum of divider 1+2+3 = 6
public class Perfect_number {
	
	public static void main(String[] args) {
		int n, sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num");
		
		n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect num");
		}
		else
		{
			System.out.println("not perfect num");
		}
	}

}
