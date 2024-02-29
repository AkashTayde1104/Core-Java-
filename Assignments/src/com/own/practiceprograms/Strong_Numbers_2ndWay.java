package com.own.practiceprograms;

import java.util.Scanner;

//sum of factorial of each digit of number equal to number itself
//145= 1! + 4! + 5! = 1 + 24 + 120 = 145

public class Strong_Numbers_2ndWay {
	
	public static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to check strong number");
		int num=sc.nextInt();
		
		int sum=0, num1=num;//num1 create bcoz after operation num==0 so store in other variable i.e num1
		
		while(num!=0)
		{
			int d=num%10;//get first digit
			
			sum=sum+fact(d);//find sum of factorial i.e call fact method and initial d in it
			
			num=num/10;//remove first digit
		}
		
		if(sum==num1)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
		
	}

}
