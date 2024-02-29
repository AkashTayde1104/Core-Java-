package com.array;

public class demo {
	public static void main(String[] args) {
		int a[];
		a=new int[5];
		a[0]=10;
		a[1]=20;
		a[3]=30;
		a[4]=40;
		a[2]=50;
		System.out.println(a[0]);
		
		System.out.println();
		int b[]= {10, 20, 30, 40, 50};
		System.out.println("length:"+b.length);
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println();
		System.out.println("----------using for each loop except for loop----------");
		for(int m:b)
		{
			System.out.println(m);
		}
	}

}
