package com.methodcalling;

public class A {
  public void m1()
  {
	  System.out.println("m1() called");
	  this.m2();
  }
  public void m2()
  {
	  System.out.println("m2() called");
	  
  }
  public static void main(String[] args) {
	System.out.println("Main Start");
	A a=new A();
	a.m1();
	System.out.println("Mian end");
}

}
