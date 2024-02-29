package com.statements;

import java.util.Scanner;

public class Control_if_else_statement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int i=sc.nextInt();
		if(i<=32)
		{
			System.out.println("candidates are eligible to apply MPSC Form");
		}
		else
		{
			System.out.println("Cnadidate doesn't fit in age criteria to apply for the mpsc form");
		}
		
	}
	
	
	
	
	

}
