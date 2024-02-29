package com.revision;

public class Constructor {
	String name;
	int id;
	
	public Constructor(String name, int id)
	{
		this.name=name;
		this.id=id;
		
	}
	public void m1()
	{
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String[] args) {
		Constructor c=new Constructor("Ram", 100);
		c.m1();
	}

}
