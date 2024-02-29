package com.WrapperClasses;

public class toString {
	public static void main(String[] args) {
		
	
	//wrapper object to string(Non-static)
	
	Integer i=new Integer(10);
	String s=i.toString();
	System.out.println(s);
	
	Long l=new Long(20);
	System.out.println(l.toString());
	
	Byte b=new Byte((byte) 10);
	System.out.println(b.toString());
	
	Short s1=new Short((short) 23);
	System.out.println(s1.toString());
	
	Float f=new Float(12.56);
	System.out.println(f.toString());
	
	Double d=new Double("12.3");
	System.out.println(d.toString());
	
	Character c=new Character('k');
	System.out.println(c.toString());
	
	Boolean b1=new Boolean("true");
	System.out.println(b1.toString());

	
	// Primitive to string(static)
	
	String s2=Integer.toString(100);
	System.out.println(s2);
	
	String s3=Short.toString((short) 10);
	System.out.println(s3);
	
	System.out.println(Byte.toString((byte) 10));
	
	System.out.println(Long.toString(40));
	
	String s4=Float.toString(11.56f);
	System.out.println(s4);
	
	String s5=Double.toString(111.5);
	System.out.println(s5);
	
	System.out.println(Character.toString('k'));
	
	System.out.println(Boolean.toString(true));
	
	
}
}
