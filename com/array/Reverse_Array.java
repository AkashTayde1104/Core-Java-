package com.array;

public class Reverse_Array {
	public static void main(String[] args) {
		int a[]= {10,20,3,5,7,2,5,9,8};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}

}
