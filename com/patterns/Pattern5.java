package com.patterns;

public class Pattern5 {
	public static void main(String[] args) {
		System.out.println("...for star.......");
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{                                        //    *
				System.out.print(" ");               //   **
			}                                        //  ***
			for(int k=1;k<=i;k++)                    // ****
			{                                        //*****
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();//space in between
		
		
		
		
		System.out.println("...for i.......");
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)                    //    1
			{                                        //   22
				System.out.print(" ");               //  333
			}                                        // 4444
			for(int k=1;k<=i;k++)                    //55555
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();//space in between
		
		
		
		
		System.out.println("...for k.......");
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)                    //    1
			{                                        //   12
				System.out.print(" ");               //  123
			}                                        // 1234
			for(int k=1;k<=i;k++)                    //12345
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
