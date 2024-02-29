package com.patterns;

public class Pattern7 {
 public static void main(String[] args) {
	 System.out.println("...for star.......");
	 for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{                                        //    *
				System.out.print(" ");               //   **
			}                                        //  ***
			for(int k=1;k<=i;k++)                    // ****
			{                                        //*****
				System.out.print("*");               // ****
			}                                        //  ***
			System.out.println();                    //   **
		}                                            //    *
	 for(int i=4;i>=1;i--)
	 {
		 for(int j=4;j>=i;j--)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 System.out.println();//space in between
		
	 
	 
	 
	 System.out.println("...for i.......");
		 for(int i=1;i<=5;i++)
			{
				for(int j=4;j>=i;j--)
				{                                        //    1
					System.out.print(" ");               //   22
				}                                        //  333
				for(int k=1;k<=i;k++)                    // 4444
				{                                        //55555
					System.out.print(i);                 // 4444
				}                                        //  333
				System.out.println();                    //   22
			}                                            //    1
		 for(int i=4;i>=1;i--)
		 {
			 for(int j=4;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++)
			 {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
		 System.out.println();//space in between
			
		 
		 
	 
		 System.out.println("...for i.......");
	 for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{                                        //    1
				System.out.print(" ");               //   12
			}                                        //  123
			for(int k=1;k<=i;k++)                    // 1234
			{                                        //12345
				System.out.print(k);                 // 1234
			}                                        //  123
			System.out.println();                    //   12
		}                                            //    1
	 for(int i=4;i>=1;i--)
	 {
		 for(int j=4;j>=i;j--)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print(k);
		 }
		 System.out.println();
	 }
}

}
