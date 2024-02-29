package com.patterns;

public class pattern2 {
	public static void main(String[] args) {
		System.out.println("...for star.......");
		for(int i=1;i<=5;i++)
		{                                     //*****
			for(int j=5;j>=i;j--)             //****
			{                                 //***
				System.out.print("*");        //**
			}                                 //*
			System.out.println();
		}
		System.out.println();//space in between
		
		System.out.println("...for i...");
		for(int i=1;i<=5;i++)
		{                                     //55555
			for(int j=5;j>=i;j--)             //4444
			{                                 //333
				System.out.print(i);          //22
			}                                 //1
			System.out.println();
		}
		System.out.println();//space in between
		
		System.out.println("...for j.......");
		for(int i=5;i>=1;i--)
		{                                     //12345
			for(int j=1;j<=i;j++)             //1234
			{                                 //123
				System.out.print(j);          //12
			}                                 //1
			System.out.println();
		}
	}

}
