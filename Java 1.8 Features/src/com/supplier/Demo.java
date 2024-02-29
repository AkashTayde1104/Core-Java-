package com.supplier;

import java.util.function.Supplier;

public class Demo {
	public static void main(String[] args) {
//		Supplier<String> s=()->
		Supplier<Integer> s=()->
		{
//			String[] s1= {"Ram", "Shyam", "Rahul", "Ravi", "Amol"};
			Integer[] s1= {1,2,3,4,5,6,7,8};
			int x=(int)(Math.random()*5+3);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
		//
		Supplier<Float> ss=()->
		{
			float[] f= {1.5f, 1.6f, 1.9f, 1.6f, 3.5f};
		    float x1=(float)(Math.random()*3+2);
			return f[(int) x1];//confusion
		};
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());
		
		//
		Supplier<Integer> sss=()->2*4;
		System.out.println(sss.get());
		
	}

}
