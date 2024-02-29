package com.patterns;

public class Pattern4 {
	public static void main(String[] args) {
		//......for star..........
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)                //*
			{                                    //**
				System.out.print("*");           //***
			}                                    //****
			System.out.println();                //*****
		}                                        //****
		for(int i=1;i<=4;i++)                    //***
		{                                        //**
			for(int j=4;j>=i;j--)                //*
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//........for i..........
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)                //1
			{                                    //22
				System.out.print(i);             //333
			}                                    //4444
			System.out.println();                //55555
		}                                        //4444
		for(int i=4;i>=1;i--)                    //333
		{                                        //22
			for(int j=1;j<=i;j++)                //1
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();//space in between
		
		//.........for j...........
		/*for(int i=1;i<=5;i++)
		{                                         //1
			for(int j=1;j<=i;j++)                 //12
			{                                     //123
				System.out.print(j);              //1234
			}                                     //12345
			System.out.println();                 //1234
		}                                         //123
		for(int i=4;i>=1;i--)                     //12
		{                                         //1
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
	}

}
