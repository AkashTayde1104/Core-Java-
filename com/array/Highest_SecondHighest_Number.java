package com.array;

public class Highest_SecondHighest_Number {
public static void main(String[] args) {
	int a[]= {10, 7, 6, 8, 5, 2, 100, 20};
	int temp;
	int highest=Integer.MIN_VALUE;
	int second_highest=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
			}
		}
		System.out.println(a[i]);
		
		if(a[i]>highest)
		{
			second_highest=highest;
			highest=a[i];
		
		}
	}
	
	System.out.println();
	System.out.println("______highest & second highst number________");
	System.out.println(highest);
	System.out.println(second_highest);
}
}
