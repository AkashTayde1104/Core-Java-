package com.programs.string;

public class findDuplicateString {
	
	public static void main(String[] args) {
		String s="great responsibility";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					
					System.out.println("duplicates:"+s.charAt(i));
				
				}
				
			}
		
		}
		
		
	}

}
