package com.scannerclass;

import java.util.Scanner;

public class AddUserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Value");
		int x = sc.nextInt();
		
		System.out.println("Enter The Second Value");
		int y=sc.nextInt();
		
		System.out.println("Add of " +x+ " & " +y+ " = " +(x+y) );
		
	
	}

}
