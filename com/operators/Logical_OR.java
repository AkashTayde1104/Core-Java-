package com.operators;

public class Logical_OR {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=5;
		System.out.println(x>y || y>z);
		System.out.println(x<y || y>z);
		System.out.println(x>y || y<z);
		if(x<y || y>z)
		{
			System.out.println("if true then Inside main condition");
		}
		else
			System.out.println("outside main");
	}

}
