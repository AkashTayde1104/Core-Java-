package com.statements;

import java.util.Scanner;

public class control_if_else_if_ladder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		if(i>0)
		{
			System.out.println("This number is positive");
		}
		else if(i<0)
		{
			System.out.println("This number is negative");
		}
		else 
		{
			System.out.println("This number is zero");
		}
	}

}
