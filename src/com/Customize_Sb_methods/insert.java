package com.Customize_Sb_methods;
public class insert {//insert string to particular index
	String s="Welcome";
	String s1;
	insert(int i,String s1)
	{
		if(i==0)
		{
			this.s1=s1+"welcome";
		}
		else if(i==1)
		{
			this.s1="w"+s1+"elcome";
		}
		else if(i==2)
		{
			this.s1="we"+s1+"lcome";
		}
		else if(i==3)
		{
			this.s1="wel"+s1+"come";
		}
		else if(i==4)
		{
			this.s1="welc"+s1+"ome";
		}
		else if(i==5)
		{
			this.s1="welco"+s1+"me";
		}
		else if(i==6)
		{
			this.s1="welcom"+s1+"e";
		}
		else if(i==7)
		{
			this.s1="welcome"+s1;
		}
		else
		{
			System.out.println("error");
		}
	}
	public String add()
	{
		return s1;
	}
	public static void main(String[] args) {
		insert ins=new insert(0,"JAVA");
		System.out.println(ins.add());
	}
}
