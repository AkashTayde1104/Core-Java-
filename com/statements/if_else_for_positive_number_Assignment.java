package com.statements;

import java.util.Scanner;

public class if_else_for_positive_number_Assignment {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i>0)
		{
			System.out.println("This is positive number");
		}
		else
		{
			System.out.println("This is negative number");
		}
	}

}
