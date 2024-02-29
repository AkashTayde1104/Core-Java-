package com.WrapperClasses;

public class demo {
	public static void main(String[] args) {
		int i=10;
		
		Integer I = new Integer(10);
		Integer I1= new Integer("10");
		System.out.println("tested");
		
		Double D =new Double(10);
		Double D1=new Double("10");
		System.out.println("Tested");
		
		Float f=new Float(10.5f);
		Float f1=new Float(10.5);
		Float f2=new Float("10");
		Float f3=new Float("10f");
		System.out.println("Testedd");
		
		Character c=new Character('c');
		System.out.println("char tested");
		
//		Byte b=new Byte(2);
		
//		Short s=new Short();
		//case sensitive
		Boolean b=new Boolean(true);
		Boolean b1=new Boolean(false);
		
		//case insensitive
		Boolean b2=new Boolean("true");//true
		Boolean b3=new Boolean("True");//true
		Boolean b4=new Boolean("false");//false
		Boolean b5=new Boolean("TRUE");//true
		Boolean br=new Boolean("tech");//false
		System.out.println(b3.equals(b5));
		System.out.println("boolean tested");
		
		
		
	}

}
