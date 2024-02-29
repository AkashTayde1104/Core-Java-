package com.array;

public class Ascending_number {
	public static void main(String[] args) {
		int a[]= {1,5,8,9,3,5};
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
		System.out.println();
		System.out.println("Lowest:"+a[0]);
		System.out.println("Second_Lowest:"+a[1]);
	}
}
