package com.own.practiceprograms;

import java.util.Scanner;

public class prime_number_between_two_num {
	
	public static void main(String[] args) {
		int n1,n2,i,j;
	
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first num");
		n1=sc.nextInt();
		System.out.print("enter 2nd num");
		n2=sc.nextInt();
		
		for(i=n1;i<=n2;i++)
		{
		for(j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				break;//we dont need to print nprime num we just check prime bet 11-20
			}
		}
		if(i==j)
		{
			System.out.print(j+" ");
		}
		}
				
	}

}
