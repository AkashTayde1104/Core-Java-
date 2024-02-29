package com.statements;

import java.util.Scanner;

public class Switch_statements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player name");
		String s=sc.next();
		switch(s)
		{
		case "virat":
			System.out.println("virat is good player");
		break;
		
		case "MS Dhoni":
			System.out.println("Ms dhoni is good captain");
			break;
			
		case "sachin":
			System.out.println("Sachin is god for cricket");
			break;
			
			default:
				System.out.println("invalid input");
			
		}
	}

}
