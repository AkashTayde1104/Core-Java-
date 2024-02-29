package com.overriding;
//we can override same as well as covariant return type
public class Rule_3 {
	public Object m1()
	{
		System.out.println("m1() parent method");
		return "test";
	}
	public int m2()// there is no relation between any primitive data so we should need to take same data in parent and child also
	{
		System.out.println("m2() parent method");
		return 10;
	}
	

}
