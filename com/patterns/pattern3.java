package com.patterns;

public class pattern3 {
	public static void main(String[] args) {
		
		System.out.println("...for star.......");
		for(int i=1;i<=5;i++)            //*****
		{                                //*****
			for(int j=1;j<=5;j++)        //*****
			{                            //*****
				System.out.print("*");   //*****
			}
			System.out.println();
		}
		System.out.println();//space in between
		
		
		
		
		System.out.println("...for i.......");
		for(int i=1;i<=5;i++)             //11111
		{                                 //22222
			for(int j=1;j<=5;j++)         //33333
			{                             //44444
				System.out.print(i);      //55555
			}
			System.out.println();
		}
		System.out.println();//space in between
		
		
		
		
		System.out.println("...for j.......");
		for(int i=1;i<=5;i++)             //12345
		{                                 //12345
			for(int j=1;j<=5;j++)         //12345
			{                             //12345
				System.out.print(j);      //12345
			}
			System.out.println();
		}
	}

}
