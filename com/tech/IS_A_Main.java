package com.tech;

public class IS_A_Main {
	public static void main(String[] args) {
		IS_A_relationship i=new IS_A_relationship();
		i.m1();
		i.m2();
		i.m3();
		
		IS_A_relationship2 i2=new IS_A_relationship2();
		i2.m1();// IN IS-A we can get all properties in child
		i2.m2();
		i2.m3();
		i2.m4();
	}

}
