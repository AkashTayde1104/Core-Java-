package com.settergetter;

public class Student {
	private int Sid;
	private String Sname;
	private Address address;
	
	public void setSid(int Sid)
	{
		this.Sid=Sid;
	}
	public int getSid()
	{
		return Sid;
	}
	
	
	public void setSname(String Sname)
	{
		this.Sname=Sname;
	}
	public String getSname()
	{
		return Sname;
	}
	
	
	public void setaddress(Address address)
	{
		this.address=address;
	}
	public Address getaddress()
	{
		return address;
	}
	@Override
	public String toString() {
		return " Sid=" + Sid + "\n Sname=" + Sname + "\n address=" + address;
		
		
	}
	
	
	
	
	

}
