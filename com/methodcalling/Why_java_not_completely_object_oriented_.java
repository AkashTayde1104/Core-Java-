package com.methodcalling;

public class Why_java_not_completely_object_oriented_ {
	 static int x=10;   // primitive data member
	 
	 static void m1()   // static keyword
	 {
		 System.out.println("hello world");
	 }
	 
	 public void m2()
	 {
		 System.out.println(this.x);// this refers for current class properties and used in only instance block/non static block
	 }
	 
	 {
		 System.out.println("inside the instance block");
	 }
	public static void main(String[] args) {
		
		System.out.println(x);
		Why_java_not_completely_object_oriented_.m1();// className.methodName;
		Why_java_not_completely_object_oriented_ o=new Why_java_not_completely_object_oriented_();// at the time object creation we called instance block
		o.m2();// object creation for non static method
	}

}
