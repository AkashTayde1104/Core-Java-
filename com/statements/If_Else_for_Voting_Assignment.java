package com.statements;

import java.util.Scanner;

public class If_Else_for_Voting_Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int i=sc.nextInt();
		
		if(i>=18)
		{
			System.out.println("Elgible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}
	}

}
