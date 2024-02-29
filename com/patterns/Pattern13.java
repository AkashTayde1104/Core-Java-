package com.patterns;

public class Pattern13 {
	public static void main(String[] args) {
		System.out.println("...for star.......");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{                                //    *
				System.out.print(" ");       //   ***
			}                                //  *****
			for(int k=1;k<=(i*2)-1;k++)      // *******
			{                                //*********
				System.out.print("*");       // *******
			}                                //  *****
			System.out.println();            //   ***
		}                                    //    *
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)               
			{                                   
				System.out.print(" ");          
			}                                   
			for(int k=1;k<=(i*2)-1;k++)         
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();//space in between
		
		
		
		
		
		
System.out.println("...for i.......");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{                                //    1
				System.out.print(" ");       //   222
			}                                //  33333
			for(int k=1;k<=(i*2)-1;k++)      // 4444444
			{                                //555555555
				System.out.print(i);         // 4444444
			}                                //  33333
			System.out.println();            //   222
		}                                    //    1
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)               
			{                                   
				System.out.print(" ");          
			}                                   
			for(int k=1;k<=(i*2)-1;k++)         
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();//space in between
		
		
		
		
		
		
System.out.println("...for k.......");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{                                //    1
				System.out.print(" ");       //   123
			}                                //  12345
			for(int k=1;k<=(i*2)-1;k++)      // 1234567
			{                                //123456789
				System.out.print(k);         // 1234567
			}                                //  12345
			System.out.println();            //   123
		}                                    //    1
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)               
			{                                   
				System.out.print(" ");          
			}                                   
			for(int k=1;k<=(i*2)-1;k++)         
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
	}
}
