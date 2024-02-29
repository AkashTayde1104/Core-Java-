package com.settergetter;

public class Employee {
	private int Eid;
	private String Ename;
	private double Salary;
    //private String Address;
	private Address address;
	private String Emailid;
	private long Pincode;
	
	public void setEid(int Eid)
	{
		this.Eid=Eid;
	}
	public int getEid()
	{
		return Eid;
	}
	
	
	public void setEname(String Ename)
	{
		this.Ename=Ename;
	}
	public String getEname()
	{
		return Ename;
	}
	
	
	public void setSlary(double Salary)
	{
		this.Salary=Salary;
	}
	public double getSalary()
	{
		return Salary;
	}
	
	
	public void setaddress(Address address)
	{
		this.address=address;
	}
	public Address Getaddress()
	{
		return address;
	}
	
	public void setEmailid(String Emailid)
	{
		this.Emailid=Emailid;
	}
	public String getEmailid()
	{
		return  Emailid;
	}
	
	
	public void setPincode(long Pincode)
	{
		this.Pincode=Pincode;
	}
	public long getPincode()
	{
		return Pincode;
	}
	
	@Override
	public String toString() {
		return " Eid=" + Eid + "\n Ename=" + Ename + "\n Salary=" + Salary + "\n Address=" + address
				+ "\n Emailid=" + Emailid + "\n Pincode=" + Pincode ;
	
//	public void setAddress(String Address)
//	{
//		this.Address=Address;
//	}
//	public String getAddress()
//	{
//		return  Address;
//	}
	
	
	}
	}
