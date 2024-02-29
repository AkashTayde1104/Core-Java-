package com.lambda.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Print_OddNo_bet_1_to_100 {
	public static void main(String[] args) {
//		int i=1;
//		while(i<=100)
//		{
//			if(i%2!=0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
	
	System.out.println("_________using Arraylist with lambda Expression___________");
	ArrayList<Integer> l=new ArrayList();
	for(int ii=1;ii<=100;ii++)
	{
		if(ii%2!=0)
		{
			l.add(ii);
		}
	}
	Comparator<Integer> c=(s1,s2)-> s1-s2;
	Collections.sort(l, c);
	for(Integer data:l)
	{
		System.out.println(data);
	}
	
	
	
	
	
	
	
	}

}
