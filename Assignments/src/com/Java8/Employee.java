package com.Java8;

public class Employee {
	
	private String name;
	private String address;
	private int eid;
	private double salary;
	
	
	
	
	
	public Employee(String name, String address, int eid, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.eid = eid;
		this.salary = salary;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", eid=" + eid + ", salary=" + salary;
	}
	
	
	
	

}
