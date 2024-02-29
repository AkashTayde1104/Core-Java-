package com.array;

public class Descending_Aarray {
	public static void main(String[] args) {
		int a[]= {1,4,6,3,8,4};
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
		System.out.println();
		System.out.println("Highest:"+a[0]);
		System.out.println("Second_Highst:"+a[1]);
	}
	

	}

	