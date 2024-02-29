package com.overriding;

public class Assignment_c extends Assignment_B {
	int y=30;
	int z=40;
	@Override
	public void m3()
	{
		System.out.println("Class C m3() called");
	}
	public void m4()
	{
		System.out.println("Class c m4() called");
	}

}
