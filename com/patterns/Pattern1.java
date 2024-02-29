package com.patterns;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("...for star.......");
		for(int i=1;i<=5;i++)               //*
		{                                   //**
			for(int j=1;j<=i;j++)           //***
			{                               //****
				System.out.print("*");      //*****
			}
			System.out.println();
				}
		
		System.out.println();//space in between
		
		System.out.println("...for i.......");
		for(int i=1;i<=5;i++)                //1
		{                                    //22
			for(int j=1;j<=i;j++)            //333
			{                                //4444
				System.out.print(i);         //55555
			}
			System.out.println();
				}
		
		System.out.println();//space in between
		
		System.out.println("...for j.......");
		for(int i=1;i<=5;i++)
		{                                      //1
			for(int j=1;j<=i;j++)              //12
			{                                  //123
				System.out.print(j);           //1234
			}                                  //12345
			System.out.println();
				
		}
	}

}
