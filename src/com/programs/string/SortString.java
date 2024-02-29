package com.programs.string;

import java.util.Arrays;

public class SortString {
	
	public static void main(String[] args) {
		String s="rock";
//		char temp;
//		char[] arr = s.toCharArray();
////		System.out.println(arr);
//		
//		for(int i=0;i<arr.length;i++)//i=0 i.e r
//		{
//			for(int j=i+1;j<arr.length;j++)//j=1=o
//			{
//				if(arr[i]>arr[j])//r>o cond T
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					
//					
//				}
//				
//			}
////		System.out.println(arr[i]);
//		}
//		
//		System.out.println(arr);
		
		
		//or
		
//		char[] Arr = s.toCharArray();
//		Arrays.sort(Arr);
//		System.out.println(Arr);
		
		
		s.chars().mapToObj(m->(char)m).sorted().forEach(c->System.out.print(c));
	}
	

}
