package com.revision;

public class Abstract_B extends Abstract_A{

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	public Abstract_B()
	{
		super();//constructor is non para thats why super used non para
	}
	
	public  Abstract_B(int x,int y)
	{
		super(20,10);
	}
	
	public static void main(String[] args) {
		Abstract_B b=new Abstract_B();
		Abstract_B b1=new Abstract_B(1,2);
		b.m1();
		b.m2();
	}

}
