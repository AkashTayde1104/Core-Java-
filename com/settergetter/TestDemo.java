package com.settergetter;

public class TestDemo {
	public static void main(String[] args) {
		Demo d=new Demo();
		{
			d.setSid(12);
			int Sid=d.getSid();
			System.out.println(Sid);
			
			d.setSname("Aishu");
			System.out.println(d.getSname());
			
			d.setSaddress("pune");
			System.out.println(d.getSaddress());
			
				}
	}

}
