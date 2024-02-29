package com.lambda.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Print_A_to_Z {
	public static void main(String[] args) {
//		char c;
//		for(c='A';c<='Z';c++)
//		{
//			System.out.println(c);
//		}
		
	
		System.out.println("________using Arraylist with Lambda Expression___________");
		ArrayList<Character> l=new ArrayList();
		for(char C='A';C<='Z';C++)
		{
			l.add(C);
		}
		
		Comparator<Character> c=(s1,s2)->s1.compareTo(s2);
		Collections.sort(l,c);
		//System.out.println(l);
		
		for(char Alphabet:l)
			{
				System.out.println(Alphabet);
			}
	}

}
