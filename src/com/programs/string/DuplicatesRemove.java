package com.programs.string;

public class DuplicatesRemove {
	public static void main(String[] args) {
		String s="hellojava";
		
		String s1="";
		String duplicates="";
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(s1.indexOf(c)==-1)
			{
			s1=s1+c;
			}
			else
			{
				duplicates=duplicates+ c +" ";
			}
		}
		System.out.println("old string" +s);
		System.out.println("duplicate character: "+duplicates);
		System.out.println("Remove duplicates :"+s1);
	}

}
