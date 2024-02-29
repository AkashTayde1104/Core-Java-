package com.programs.string;

public class RemovevDuplicates {
	 
public static String removeDuplicate(String s)
	{
		String s1="";

		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(s1.indexOf(c)==-1)
			{
				s1=s1+c;
			}
			
		}
		return s1;
		
	}
	public static void main(String[] args) {
		String s="Hellojava";

		System.out.println("old string:" +s);
	
		System.out.println("duplicate remove: "+removeDuplicate(s));

		
//		String s1 ="";
//		
//			for(int i=0;i<s.length();i++)
//			{
//				String ss=""+s.charAt(i);
//				
////				System.out.println(ss);
//				
//				if(s1.contains(ss))
//				{
//					System.out.println("duplicate character: "+ss);
//					continue;
//					
//				}
//				
//				s1=s1+ss;
//			}
//			System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		or
		
		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					break;
//					
//				}
//			
//				System.out.println(s.charAt(i));
//			}
////			System.out.println(s.charAt(i));
//		}
//		
//
//			
			
	}

}
