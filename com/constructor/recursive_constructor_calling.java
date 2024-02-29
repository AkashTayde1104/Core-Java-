package com.constructor;
//get error at compile time
public class recursive_constructor_calling {
	
	public recursive_constructor_calling()
	{
//		this(10);
		System.out.println("no args constructor");
	}
	
	public recursive_constructor_calling(int x)
	{
		this();
		System.out.println("int type constructor");
	}
	public static void main(String[] args) {
		recursive_constructor_calling r=new recursive_constructor_calling();
		System.out.println(r.hashCode());//if one numeric code got simply means that only one object created
	}
}
