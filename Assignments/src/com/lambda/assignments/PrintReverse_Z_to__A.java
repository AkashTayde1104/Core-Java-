package com.lambda.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintReverse_Z_to__A {
	public static void main(String[] args) {
//		char c;
//		for(c='Z';c>='A';c--)
//		{
//			System.out.println(c);
//		}
		
		
		
		System.out.println("______Using Arrayllist with Lambda Expression_________");
		ArrayList<Character> l=new ArrayList();
//		for(char C='Z';C>='A';C--)
		for(char C='A';C<='Z';C++)
		{
			l.add(C);
		}
		Comparator<Character> c=(s1,s2)->-s1+s2;
		Collections.sort(l, c);
		
		for(Character data:l)
		{
			System.out.println(data);
		}
	}
	

}
