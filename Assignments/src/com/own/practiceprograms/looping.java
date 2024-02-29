package com.own.practiceprograms;

import java.util.Scanner;

public class looping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter number");
		int x=sc.nextInt();
	do {
		if(x>0)
		{
			System.out.println("postive");
		}
		else
		{
			System.out.println("negative");
		}
		System.out.println("you want to enetr number again");
		System.out.println("enetr number");
		 x=sc.nextInt();
	}while(x>0 || x<0);
		}

	}

	


