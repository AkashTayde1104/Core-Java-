package com.patterns;

public class Pattern10 {
	public static void main(String[] args) {
		System.out.println("...for star.......");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{                                //    *
				System.out.print(" ");       //   * *
			}                                //  * * *
			for(int k=1;k<=i;k++)            // * * * *
			{                                //* * * * *
				System.out.print("* ");      // * * * *
			}                                //  * * *
			System.out.println();            //   * *
		}                                    //    *
		for(int i=4;i>=1;i--)
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
		
		System.out.println();//space in between
		
		
		
		
		
System.out.println("...for i.......");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{                                //    1
				System.out.print(" ");       //   2 2
			}                                //  3 3 3
			for(int k=1;k<=i;k++)            // 4 4 4 4
			{                                //5 5 5 5 5
				System.out.print(i+" ");     // 4 4 4 4
			}                                //  3 3 3
			System.out.println();            //   2 2 
		}                                    //    1
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)               
			{                                   
				System.out.print(" ");          
			}                                  
			for(int k=1;k<=i;k++)              
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();//space in between
		
		
		
		
		
		
System.out.println("...for k.......");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{                                //    1
				System.out.print(" ");       //   1 2 
			}                                //  1 2 3
			for(int k=1;k<=i;k++)            // 1 2 3 4
			{                                //1 2 3 4 5
				System.out.print(k+" ");     // 1 2 3 4 
			}                                //  1 2 3
			System.out.println();            //   1 2 
		}                                    //    1
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)               
			{                                   
				System.out.print(" ");          
			}                                  
			for(int k=1;k<=i;k++)              
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	
		
	}
	

}
