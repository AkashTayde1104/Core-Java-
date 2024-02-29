package com.operators;

public class Calculation {
	int x=10;
	int y=20;
	int z;
	public void add()
	{
		z=x+y;
		System.out.println("Add of" + x+ " & "+y+  " = "+z );
	}
	public void sub()
	{
		z=x-y;
		System.out.println("sub of"+x+" & "+y+" = "+z);
	}
	public void mul()
	{
		z=x*y;
		System.out.println("mul of"+x+ " & "+y +" = "+z);
	}
	public void div()
	{
		z=x/y;
		System.out.println("div of" +x+ " & " +y+ " = "+z);
		
	}
	public void mod()
	{
		z=x%y;
		System.out.println("modulus of"+x + " & " +y+ " = "+z);
	}
	public static void main(String[] args) {
		Calculation c=new Calculation();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.mod();
	}

}
