package com.revision;

public class Constructor_2 extends Constructor_1 {
	public Constructor_2()
	{
		this(10);
		System.out.println("non para");
	}
	
	public Constructor_2(int i)
	{
		super('c');//this();
		System.out.println("int type");
	}
	
//	public Constructor_2()
//	{
//		super('c');
//	}
	
//	public void demo()
//	{
//		this.demo1();
//		System.out.println("method");
//	}
//	
//	public void demo1()
//	{
//		this.demo();
//		System.out.println("method1");
//	}
	public static void main(String[] args) {
		Constructor_2 c=new Constructor_2();
		//c.demo();
	}

}
