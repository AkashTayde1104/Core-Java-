package com.own.practiceprograms;

import java.util.Scanner;

public class Strong_Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to check string num");
		
		int number=sc.nextInt();
	
		//first store number in another variable
		int temp=number;
		
		int sum=0;
		
		while(number>0)
		{
			//get first number
			int digit=number%10;
			
			//find factorial of digit
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
			}
			//add factorial value to sum
			sum=sum+fact;
			
			//remove last digit
			number=number/10;
			
		}
		if(sum==temp)
		{
			System.out.println("Num is Strong Number");
		}
		
		else
		{
			System.out.println("Num is not Strong Number");
		}
		
		
		
		
		
		
	}

}
