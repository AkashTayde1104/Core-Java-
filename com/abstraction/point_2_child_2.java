package com.abstraction;

public class point_2_child_2 extends point_2_child {
	public static void main(String[] args) {
		point_2_child_2 c=new point_2_child_2();
		c.m1();// we can't get implementation in class if implement before also
		c.m2();
		c.m4();
		point_2_child_2.m3();
	}

}
