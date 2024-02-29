package com.array;

import java.util.Scanner;

public class Delete_Element {
	public static void main(String[] args) {
		int a[]= {10, 5, 9, 7, 6, 8, 11};
		int del;
	
		for(int i=0;i<a.length;i++)
		{
			System.out.print( a[i]+" ");
		}
		System.out.println(); 
		System.out.println();
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one element from above array you want to delete:");
		del=sc.nextInt();
		
		
		//Enter number to delete
		for(int j=0;j<a.length;j++)
		{
			if (a[j]==del)
			{
				continue;
			}
			System.out.print(a[j]+" ");
			
		}
		System.out.println();
		System.out.println();
		}
	}

}

