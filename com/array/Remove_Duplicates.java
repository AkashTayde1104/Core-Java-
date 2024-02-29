package com.array;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
	public static void main(String[] args) {
		
	
	int a[]= {12,45,67,45,12,30,90};
	
	Set<Integer> s=new HashSet<Integer>();
	for(int data:a)
	{
		s.add(data);
	}
//	System.out.println(s);

	for (int data : s) {
		System.out.println(data);
	}

}
}