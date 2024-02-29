package com.revision;

public class Overloading_A {
	public void add()
	{
		int x=10;
		int y=20;
		System.out.println("c="+(x+y));
	}
	public Overloading_A()
	{
		System.out.println("constructor non para ");
	}
	
	public Overloading_A(char c)
	{
		System.out.println("char type constructor");
	}
	
	private static void add(int X)
	{
		int x=10;
		int y=20;
		int z=60;
		System.out.println("c="+(x+y+z));
	}
	public final void add(int X, char C)
	{
		int x=10;
		int y=20;
		int z=60;
		int p=50;
		System.out.println("c="+(x+y+z+p));
	}
	public static void main()
	{
		System.out.println("main method");
	}
	public static void main(String[] args) {
		Overloading_A a=new Overloading_A();
		Overloading_A a1=new Overloading_A('c');
		a.add();
		a.add(10, 'c');
		Overloading_A.add(10);
		Overloading_A.main();
	}

}
