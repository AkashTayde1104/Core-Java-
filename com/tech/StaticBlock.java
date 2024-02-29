package com.tech;

public class StaticBlock {
	static
	{
		System.out.println("inside static block");
		
	}
	{
		System.out.println("inside instance block");
		
	}
	public static void main(String[] args) {
		StaticBlock s=new StaticBlock();
		System.out.println("inside main");
	}

}
