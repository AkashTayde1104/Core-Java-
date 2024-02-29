package com.settergetter;

public class Demo {
	private int Sid;
	private String Sname;
	private String Saddress;
	
	//getter
	public int getSid() {
		return Sid;
	}
	
	//setter
	public void setSid(int sid) {
		this.Sid = sid;
	}
	
	//getter for name
	public String getSname() {
		return Sname;
	}
	
	//setter for name
	public void setSname(String sname) {
		Sname = sname;
	}
	
	//getter for addtress
	public String getSaddress() {
		return Saddress;
	}
	
	//setter for address
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	

}
