package com.statements;

import java.util.Scanner;

public class Calculator_UsingSwitch_Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		double d=sc.nextDouble();
		
		System.out.println("Enter second number");
		double d1=sc.nextDouble();
		
		System.out.println("enter your choices + \n - \n * \n / \n %");
		char s=sc.next().charAt(0);
		

		switch(s)
		{
		case '+':
			System.out.println("add of "+d+ " & "+d1+ "=" +(d+d1) );
			break;
		case '-':
			System.out.println("sub of "+d +" & "+d1+ "=" +(d-d1) );
			break;
		case '*':
			System.out.println("mul of "+d +" & "+d1+ "=" +(d*d1) );
			break;
		case '/':
			System.out.println("div of "+d +" & "+d1+ "=" +(d/d1) );
			break;
		case '%':
			System.out.println("mod of "+d +" & "+d1+ "=" +(d%d1) );
			break;
			default:
				System.out.println("Invalid input");
			
			
		}
		
	}

}
