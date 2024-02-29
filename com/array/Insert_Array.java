package com.array;

public class Insert_Array {
	public static void main(String[] args) {
		int a[]= {10,5,9,7,6,8,11};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int pos=3;
		int insert=100;
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=insert;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
