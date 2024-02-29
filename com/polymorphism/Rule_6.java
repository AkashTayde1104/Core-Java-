package com.polymorphism;
// we can overload method by using same method name
//but parameter must be different
//order of parameter must be different

public class Rule_6 {
	public void add()
	{
		System.out.println("Non-paramaterised method");
	}
	public void add(int x, char c)
	{
		System.out.println("int-char type method");
	}
	public void add(char c, int x)
	{
		System.out.println("char-int type method");
	}
	public static void main(String[] args) {
		Rule_6 r=new Rule_6();
		r.add();
		r.add('m', 23);
		r.add(34, 'd');
	}

}
