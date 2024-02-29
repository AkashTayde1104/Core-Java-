package com.statements;

import java.util.Scanner;

public class Switch_Statement_Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("India's famous female sport player" );
		System.out.println("please select below choice \n 1)sania mirza \n 2) mary kom \n 3) saina nehwal");
		System.out.println("Enter your choice");
		int x=sc.nextInt();
		
		switch(x)
		{
		case 1:
			System.out.println("Sania mirza(tennis) \n one of the,.........");
			break;
			
		case 2:
			System.out.println("Mary Kom (Boxing) \n a six time worls champion........");
			break;
			
		case 3:
			System.out.println("Saina Nehwal (Badminton) \n The first india shuttler.....");
			break;
			
			default:
				System.out.println("invalid input");
		}
		
	}

}
