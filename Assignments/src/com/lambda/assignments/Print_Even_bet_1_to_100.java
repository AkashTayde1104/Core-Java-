package com.lambda.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Print_Even_bet_1_to_100 {
	public static void main(String[] args) {

//	int i=1;
//	while(i<=100)
//	{
//		if(i%2==0)
//		{
//			System.out.println("Even No: "+i);
//		}
//		i++;
//		else if(i%2!=0)
//		{
//			System.out.println("Odd No: "+i);
//		}
//		else
//		{
//			System.out.println();
//		}
//	}

		System.out.println("_________Using Arraylist with lambda Expression________");
		ArrayList<Integer> l = new ArrayList();
		int ii = 1;
		while (ii <= 100) {
			if (ii % 2 == 0) {
				l.add(ii);
			}
			ii++;
		}
		Comparator<Integer> c = (s1, s2) -> s1 - s2;

		Collections.sort(l, c);
		for (Integer data : l) {
			System.out.println(data);
		}
	}
}