package com.patterns;

public class Pattern12 {
public static void main(String[] args) {
		
		System.out.println("....for star........");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)               //*********
			{                                   // *******
				System.out.print(" ");          //  *****
			}                                   //   ***
			for(int k=1;k<=(i*2)-1;k++)         //    *
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();//space in between
		
		
		
		
		
System.out.println("....for i........");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)               //555555555
			{                                   // 4444444
				System.out.print(" ");          //  33333
			}                                   //   222
			for(int k=1;k<=(i*2)-1;k++)         //    1
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();//space in between
		
		
		
		
		

System.out.println("....for k........");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)               //123456789
			{                                   // 1234567
				System.out.print(" ");          //  12345
			}                                   //   123
			for(int k=1;k<=(i*2)-1;k++)         //    1
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		System.out.println();//space in between

}
}
