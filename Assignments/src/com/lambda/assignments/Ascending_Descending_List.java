package com.lambda.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ascending_Descending_List {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(12);
		l.add(69);
		l.add(25);
		l.add(36);
		l.add(56);
		l.add(89);
		l.add(10);
		l.add(52);
		
		
		 Comparator<Integer> c=(s1,s2)->s1-s2;
//		 {
//			 Integer I1=(Integer)s1;
//			 Integer I2=(Integer)s2;
//			 return I1.compareTo(I2);
//		 };
		 Collections.sort(l, c);
		 System.out.println(" Ascending order");
		 for(Integer data:l)
		 {
			 System.out.println(data);
		 }
		 
		 Comparator<Integer> c1=(s1,s2)->
		 {
			 Integer I3=(Integer)s1;
			 Integer I4=(Integer)s2;
			 return I3<I4?1:(I3>I4)?-1:0;//DESCENDING
		 };
		 Collections.sort(l, c1);
		 System.out.println("\n Descending order");
		 for(Integer data1:l)
		 {
			 System.out.println(data1);
		 }
	}

}
