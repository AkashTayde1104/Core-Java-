package com.array;

public class EvenNumber {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,3,2,5,6,7,5};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println();
		System.out.println("---------using for each loop--------");
		for(int m:a)
		{
//			if(m%2==0)
//			{
//				System.out.println("even number"+m);
//			}
			if(m%2!=0)
			{
				System.out.println("odd number"+m);
			}
			
			
		}
	}

}
