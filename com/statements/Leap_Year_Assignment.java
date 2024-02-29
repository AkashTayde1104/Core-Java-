package com.statements;

import java.util.Scanner;

public class Leap_Year_Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is a common year");
		}
		
	}

}
