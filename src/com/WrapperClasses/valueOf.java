package com.WrapperClasses;

public class valueOf {
	public static void main(String[] args) {
		
		//primitive or string to wrapper object(static)
		int x=100;
		Integer I=Integer.valueOf(100);
		System.out.println(I);
		
		Double d=Double.valueOf(10.5);
		System.out.println(d);
		
		Float f=Float.valueOf("10.5f");
		System.out.println(f);
		
		Short s=Short.valueOf((short) 10);
		System.out.println(s);
		
		System.out.println(Byte.valueOf((byte) 10));
		
		System.out.println(Float.valueOf(11.5f));
		
		System.out.println(Double.valueOf(111.2));
		
		System.out.println(Character.valueOf('h'));
		
		System.out.println(Boolean.valueOf(true));
	}

}
