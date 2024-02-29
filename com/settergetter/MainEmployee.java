package com.settergetter;

public class MainEmployee {
	public static void main(String[] args) {
		
		System.out.println("--------e1 employee-------");
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("Suraj");
		e.setEmailid("suraj@123");
		//e.setAddress("pune");
		e.setPincode(412105);
		e.setSlary(40000);
		
		System.out.println(e);
		
		System.out.println();
		System.out.println("-------e2 employee----------");
		
		Employee e2=new Employee();
		e2.setEid(102);
		e2.setEname("Ram");
		//e2.setAddress("Nashik");
		e2.setEmailid("Ram@123");
		e2.setSlary(50000);
		e2.setPincode(422010);
		
		System.out.println(e2.getEid());
		
		
		System.out.println(e2);
		
		System.out.println();
		System.out.println("-------e3 employee----------");
		
		Employee e3=new Employee();
		e3.setEid(103);
		e3.setEname("Rajesh");
		e3.setEmailid("Rajesh@123");
		//e3.setAddress("Solapur");
		e3.setSlary(65000);
		e3.setPincode(543243);
		
		System.out.println(e3);
		
		System.out.println();
		System.out.println("-------e4 employee----------");
		
		Employee e4=new Employee();
		e4.setEid(104);
		e4.setEname("Vicky");
		e4.setEmailid("Vicky@123");
		//e4.setAddress("Mumbai");
		e4.setSlary(25000);
		e4.setPincode(34578);
		
		System.out.println(e4);
	}

}
