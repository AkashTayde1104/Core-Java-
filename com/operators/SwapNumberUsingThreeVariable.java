package com.operators;

public class SwapNumberUsingThreeVariable {
public static void main(String[] args) {
	int x=10;
	int y=20;
	System.out.println("Before Swapping x="+x+" & y="+y);
	int temp;
	temp=x;
	x=y;
	y=temp;
	System.out.println("After swapping x="+x+" & y="+y);
}
}
