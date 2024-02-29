package com.patterns;

public class Pattern_Assignment {
	public static void main(String[] args) {
		System.out.println("1)");
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)            //    *
			{                                //   * *
				System.out.print(" ");       //  * * *
			}                                // * * * *
			for(int k=1;k<=i;k++)            //* * * * *
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("2)");
		
		for(int i=1;i<=5;i++)
		{                                     //*
			for(int j=1;j<=i;j++)             //**
			{                                 //***
				System.out.print("*");        //****
			}                                 //*****
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("3)");
		
		for(int i=1;i<=5;i++)
		{                                   //    *
			for(int j=4;j>=i;j--)           //   **
			{                               //  ***
				System.out.print(" ");      // ****
			}                               //*****
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("4)");
		
		for(int i=1;i<=5;i++)
		{
			if(i<=1)
			{                                  //*
				System.out.println("*");       //    ***
			}                                  //   *****
			else                               //  *******
			{                                  // *********
			for(int j=4;j>=i;j--)              //  *******
			{                                  //   *****
				System.out.print(" ");         //    ***
			}                                  //     *
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			}	
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=7;k>=(i*2)-1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("5)");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)             //*****
			{                                 //****
				System.out.print("*");        //***
			}                                 //**
			System.out.println();             //*
		}
		
		System.out.println();
		System.out.println("6)");
		
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{                                  //     *
			                                   //    * *
				System.out.print(" ");         //   * * *
			                                   //  * * * *
			}                                  // * * * * *
			for(int k=1;k<=i;k++)              //* * * * * * 
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("7)");
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)              //* * * * * * 
			{                                  // * * * * *
			                                   //  * * * * 
				System.out.print(" ");         //   * * * 
			                                   //    * * 
			}                                  //     *
			for(int k=6;k>=i;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		}
	
}
