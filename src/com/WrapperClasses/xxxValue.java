package com.WrapperClasses;

public class xxxValue {
	public static void main(String[] args) {
		//object to primitive(non-static)
		Integer i=new Integer(100);
		int x=i.intValue();
		System.out.println(x);
		
		Byte b=new Byte((byte) 10);
		byte bb=b.byteValue();
		System.out.println(bb);
		
		Short s=new Short((short) 20);
		short ss=s.shortValue();
		System.out.println(ss);
		
		Long l=new Long(30);
		System.out.println(l.longValue());
		
	    Float f=new Float(10.5);
	    System.out.println(f.floatValue());
	    
	    Double d=new Double(123.65);
	    System.out.println(d.doubleValue());
	    
	    //character to primitive
	    Character c=new Character('k');
	    System.out.println(c.charValue());
	    
	    //Boolean to primitive
	    Boolean b1=new Boolean(true);
	    System.out.println(b1.booleanValue());
	}

}
