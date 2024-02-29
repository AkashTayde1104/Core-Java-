package com.constructor;

public class Demo_child_constr_for_intialization extends Demo_parent_constr_for_intialization
{
	int rollNo;
	int marks;
	public Demo_child_constr_for_intialization(String name, int age, int rollNo, int marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public static void main(String[] args) {
		Demo_child_constr_for_intialization d=new Demo_child_constr_for_intialization("ram", 20, 45, 67);
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.rollNo);
		System.out.println(d.marks);
	}
	
	

}
