package com.toString_method;

public class ex4 {
	String name;
	int id;
	
 public ex4(String name, int id)
 {
	 this.name=name;
	 this.id=id;
	 
 }
 
 
 @Override
public String toString() {
	return "ex4:name=" + name + ", id=" + id  ;
}


public static void main(String[] args) {
	ex4 e=new ex4("ram", 10);
	System.out.println(e);
	System.out.println(e.getClass().getName()+"@"+Integer.toHexString(e.hashCode()));
			
}
}
