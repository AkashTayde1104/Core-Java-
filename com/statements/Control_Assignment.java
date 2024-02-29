package com.statements;

import java.util.Scanner;

public class Control_Assignment {
	// Find largest number from 199, 201
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int i=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		int i1=sc.nextInt();
		if(i>i1)
		{
			System.out.println("The largest number is="+i);
		}
	 else
		{
			System.out.println("The largest number is="+i1);
		}
		
	}

}
