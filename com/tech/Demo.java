package com.tech;

class demo1
{
	public void m2()
	{
		System.out.println("m2");
	}

}

class demo2
{
	public void m3()
	{
		System.out.println("m3 ");
	}
}

public class Demo {
	public void m1() {
		System.out.println("m1");
	}
	
public static void main(String[] args) {

demo1 d1=new demo1();
d1.m2();

demo2 d2=new demo2();
d2.m3();

Demo d=new Demo();
d.m1();

}
}



