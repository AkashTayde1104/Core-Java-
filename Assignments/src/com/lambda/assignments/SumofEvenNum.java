package com.lambda.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SumofEvenNum {
	public static void main(String[] args) {
//		int i = 1;
//		int sum = 0;
//		while (i <= 10) {
//			if (i % 2 == 0) {
//				System.out.print("Even No:" + i);
//				System.out.println();
//				sum = sum + i;
//
//			}
//			i++;
//		}
//		System.out.println("Sum of Even num: " + sum);

		System.out.println("_______using Arraylist with Lambda Expression________");
		ArrayList<Integer> l = new ArrayList();
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {

				sum = sum + i;
				l.add(sum);// one by one get output
			}
		}
//		l.add(sum);//30
		Comparator<Integer> c = (s1, s2) -> s1 - s2;
		Collections.sort(l, c);
		for (Integer data : l) {
			System.out.println(data);
		}
	}
}
