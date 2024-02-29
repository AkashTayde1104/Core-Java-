package com.own.practiceprograms;

import java.util.Scanner;

public class Square_root {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr num");
		int n=sc.nextInt();
		
		double root = Math.sqrt(n);
		System.out.println("root of " +n+ " is "+ root);
	}

}
