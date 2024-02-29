package com.WrapperClasses;

public class AutounBoxing {
	public static void main(String[] args) {
		Integer I=new Integer(500);
		System.out.println(I);
		
		//without autounboxing
		int i=I.intValue();
		System.out.println(i);
		
		//with autounboxing
		int i1=I;
		System.out.println(i1);
		
		Long L=new Long(34);
		long l=L;
		System.out.println(l);
		
		Byte B=new Byte((byte) 10);
		byte b=B;
		System.out.println(b);
		
		Short S=new Short((short) 10);
		short s=S;
		System.out.println(s);
		
		Double D=new Double(45);
		double d=D;
		System.out.println(d);
		
		Float F=new Float(114.778f);
		float f=F;
		System.out.println(f);
		
		Character C=new Character('k');
		char c=C;
		System.out.println(c);
		
		Boolean B1=new Boolean(true);
		boolean b1=B1;
		System.out.println(b1);
	}

}
