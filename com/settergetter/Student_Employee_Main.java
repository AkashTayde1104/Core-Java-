package com.settergetter;

public class Student_Employee_Main {
	public static void main(String[] args) {
		
		Address adrs=new Address();
		adrs.setAreaName("Moshi");
		adrs.setCityName("Pune");
		
		Address adrs1=new Address();
		adrs1.setAreaName("College Road");
		adrs1.setCityName("Nashik");
		
		System.out.println("-----------s student--------");
		System.out.println("------------adrs-------------");
		
		Student s=new Student();
		s.setSid(101);
		s.setSname("Rahul");
		s.setaddress(adrs);
		
		System.out.println(s);
		
		System.out.println();
		System.out.println("-----------s1 student--------");
		
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("Ram");
		s1.setaddress(adrs);
		
        System.out.println(s1);
		
		System.out.println();
		System.out.println("-----------s2 student--------");
		
		
		Student s2=new Student();
		s2.setSid(103);
		s2.setSname("Rakesh");
		s2.setaddress(adrs);
		
        System.out.println(s2);
		
		System.out.println();
		System.out.println("-----------s3 student--------");
		System.out.println("------------adrs1-------------");
		
		Student s3=new Student();
		s3.setSid(104);
		s3.setSname("Shivansh");
		s3.setaddress(adrs1);
		
        System.out.println(s3);
		
		System.out.println();
		System.out.println("-----------s4 student--------");
		
		Student s4=new Student();
		s4.setSid(105);
		s4.setSname("Shivam");
		s4.setaddress(adrs1);
		
        System.out.println(s4);
		
		System.out.println();
		System.out.println("-----------s5 student--------");
		
		
		Student s5=new Student();
		s5.setSid(106);
		s5.setSname("Ravi");
		s5.setaddress(adrs1);
		
		System.out.println(s5);
		System.out.println();
		System.out.println("______________________________________________________________________________________________________");
		System.out.println("---------Using Array-------------");
		System.out.println("-------- Employee-------");
		
		Employee E1=new Employee();
		E1.setEid(101);
		E1.setEname("Suraj");
		E1.setEmailid("suraj@123");
		E1.setaddress(adrs);
		E1.setPincode(412105);
		E1.setSlary(40000);
		
		Employee E2=new Employee();
		E2.setEid(102);
		E2.setEname("Ram");
		E2.setaddress(adrs);
		E2.setEmailid("Ram@123");
		E2.setSlary(50000);
		E2.setPincode(422010);
		
		Employee E3=new Employee();
		E3.setEid(103);
		E3.setEname("Rajesh");
		E3.setEmailid("Rajesh@123");
		E3.setaddress(adrs1);
		E3.setSlary(65000);
		E3.setPincode(543243);
		
		
		Employee E4=new Employee();
		E4.setEid(104);
		E4.setEname("Vicky");
		E4.setEmailid("Vicky@123");
		E4.setaddress(adrs1);
		E4.setSlary(25000);
		E4.setPincode(34578);
		
		
		Employee emp[]= {E1, E2, E3, E4};
		for( Employee E:emp)
		{
			System.out.println(E);
			System.out.println("______________________");
		}
		
	}

}
