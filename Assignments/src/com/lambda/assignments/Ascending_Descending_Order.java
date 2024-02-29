package com.lambda.assignments;

public class Ascending_Descending_Order {
	public static void main(String[] args) {
	  int a[]= {12,69,25,36,56,89,10,52};
	  //System.out.println(a.length);
	  
	  System.out.println("Ascending order \n");
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]>a[j])
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
			 
		  }
		  System.out.println(a[i]);
	  }
	  
	  System.out.println("\nDescending order \n ");
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]<a[j])
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
			 
		  }
		  System.out.println(a[i]);
	  }
	  
	}

}
