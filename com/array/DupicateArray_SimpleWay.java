package com.array;

import java.util.HashSet;
import java.util.Set;

public class DupicateArray_SimpleWay {
public static void main(String[] args) {
	int a[]= {1,2,3,4,3,2,5,6,7,5};
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		}
	}
	
	System.out.println();
	System.out.println("-------using collection----------");
	
	Set<Integer> s=new HashSet<Integer>();
	for(int m:a)
	{
		boolean b=s.add(m);
		if(b==false)
		{
			System.out.println(m);
		}
	}
}
}
