package com.statements;

import java.util.Scanner;

public class Control_Nested_If_Statements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		
		if(i>0)
		{
			System.out.println("this is positive number");
			if(i%2==0)
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("Odd number");
			}
		}
		else if(i<0)
		{
			System.out.println("This is negative number");
		}
		else
		{
			System.out.println("This number is zero");
		}
	}

}
