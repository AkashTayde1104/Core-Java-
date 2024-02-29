package com.patterns;

public class Pattern6_Assignment {
	public static void main(String[] args) {
		System.out.println("...for star.......");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)             //*****
			{                                 //****
				System.out.print(" ");        //***
			}                                 //**
			for(int k=5;k>=i;k--)             //*
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();//space in between
		
		
		
		
		System.out.println("...for i.......");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)             // 11111
			{                                 //  2222
				System.out.print(" ");        //   333
			}                                 //    44
			for(int k=5;k>=i;k--)             //     5
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();//space in between
		
		
		
		
		
		System.out.println("...for k.......");
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)             // 12345
	     	{                                 //  1234
				System.out.print(" ");        //   123
			}                                 //    12
			for(int k=1;k<=i;k++)             //     1
			{
				System.out.print(k);
			}
				System.out.println();
			}	
	}

}
