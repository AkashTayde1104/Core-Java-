package com.WrapperClasses;

public class Autoboxing {
	public static void main(String[] args) {
		
		int x=10;
		
		//Without AutoBoing
		Integer i1=Integer.valueOf(x);
		System.out.println(i1);
		
		//With AutoBoxing
		Integer i=x;
		System.out.println(i);
		
		long l=12;
		Long L=l;
		System.out.println(L);
		
		byte b=10;
		Byte B=b;
		System.out.println(B);
		
		short s=23;
		Short S=s;
		System.out.println(S);
		
		float f= 77.88f;
		Float F=f;
		System.out.println(F);
		
		double d=23.56;
		Double D=d;
		System.out.println(D);
		
		char c='k';
		Character C=c;
		System.out.println(C);
		
		boolean b1=true;
		Boolean B1=b1;
		System.out.println(B1);
		
		
		
	}

}
