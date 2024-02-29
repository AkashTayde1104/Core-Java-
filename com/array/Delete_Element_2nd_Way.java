package com.array;

public class Delete_Element_2nd_Way {
	public static void main(String[] args) {
		int a[]= {10,5,9,7,6,8,11};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	
		int delete=9;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==delete)
			{
				continue;
			}
		System.out.print(a[i]+" ");
		}
	}
}