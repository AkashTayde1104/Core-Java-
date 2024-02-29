package com.array;

public class Lowest_Element {
public static void main(String[] args) {
	int a[]= {10,7,6,8,5, 2, 100, 20};
//	int a[]= {10,7,3,8,9,3,5,6};
	int Lowest=Integer.MAX_VALUE;
	int SecondLowest=Integer.MAX_VALUE;
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
			if(i==1)
			{
				break;
			}
			System.out.println(a[i]);
}
	System.out.println();
System.out.println(a[0]);
}
}

