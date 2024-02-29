package com.lambda.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReverseTables {
	public static void main(String[] args) {
//		while(true)
//		{
//	    System.out.println();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number:");
//		int num=sc.nextInt();
//		for(int i=10;i>=1;i--)
//		{
//			System.out.println(i*num);
//			
//		}
//		}

		// or
//		for(int i=10;i>=1;i--)
//		{
//			System.out.println(i*2);
//			
//		}
//		
		System.out.println("________using Arraylist with Lmabda Expression_______");
		ArrayList<Integer> l = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			l.add(i * 2);
		}

		Comparator<Integer> c = (s1, s2) -> -s1 + s2;

		Collections.sort(l, c);
		for (Integer data : l) {
			System.out.println(data);
		}

	}

}
