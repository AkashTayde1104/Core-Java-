package com.operators;

public class SwapNumberUsingTwoVariable {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Before swapping x=" +x + " & y=" +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swappinf x="+x +" & y=" +y);
	}

}
