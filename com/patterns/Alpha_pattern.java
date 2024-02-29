package com.patterns;

public class Alpha_pattern {
	public static void main(String[] args) {
		
	
	int Alpha=65;
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print((char)(Alpha)+" ");
			Alpha++;
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print((char)(Alpha)+" ");
			Alpha++;
		}
		System.out.println();
	}
	
	
	System.out.println();
	System.out.println("...........1 to 10 numbers...........");
	// For numbers 1 to 10
	int Num=1;
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print((int)(Num)+" ");
			Num++;
		}
		System.out.println();
	}
	}
	

}
