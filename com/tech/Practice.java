package com.tech;



public class Practice {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
		if(i<=1)
		{
			System.out.println("*");
		}
		else
		{
				for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
		}
	
	
			
}
