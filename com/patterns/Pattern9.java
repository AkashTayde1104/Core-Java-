package com.patterns;

public class Pattern9 {
	public static void main(String[] args) {
		
		System.out.println("....for star........");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)               //* * * * *
			{                                   // * * * *
				System.out.print(" ");          //  * * *
			}                                   //   * *
			for(int k=1;k<=i;k++)               //    *
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();//space in between
		
		
		
		
		
		System.out.println("....for i........");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)               //5 5 5 5 5
			{                                   // 4 4 4 4
				System.out.print(" ");          //  3 3 3
			}                                   //   2 2
			for(int k=1;k<=i;k++)               //    1
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();//space in between





		
		System.out.println("....for k........");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)               //1 2 3 4 5
			{                                   // 1 2 3 4
				System.out.print(" ");          //  1 2 3
			}                                   //   1 2
			for(int k=1;k<=i;k++)               //    1
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
