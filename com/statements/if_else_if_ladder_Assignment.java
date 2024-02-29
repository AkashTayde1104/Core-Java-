package com.statements;

import java.util.Scanner;

public class if_else_if_ladder_Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter RAM age");
		int ram=sc.nextInt();
		
		System.out.println(" enter SHAM age");
		int sham=sc.nextInt();
		
		System.out.println("enter AMOL is");
		int amol=sc.nextInt();
		
		if(ram>sham && sham<amol)
		{
			System.out.println("RAM is Older");
		}
		else if(sham>amol)
		{
			System.out.println("SHAM is older");
		}
		else
		{
			System.out.println("AMOL is older");
		}
		
		if (ram<sham && sham< amol)
		{
			System.out.println("RAM is elder");
		}
		else if(amol>sham)
		{
			System.out.println("SHAM is elder");
		}
		else
		{
			System.out.println("AMOL is elder");
		}
			
	}

}
