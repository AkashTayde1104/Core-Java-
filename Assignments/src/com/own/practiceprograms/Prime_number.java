package com.own.practiceprograms;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args){
//		for(int i=2;i<=100;i++)
//		{
//			int count=0;//for i
//			for(int j=2;j<i;j++)//
//			{
//				if(i%j==0)//(2/2==0)
//				{
//					count++;//condition true then increase value of i by 1 
//				}
//			}
//			if(count==0)
//			{
//				System.out.println(i+" ");
//				
//			}
//		}
		
		int n, count=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Num is prime Number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
}
}
