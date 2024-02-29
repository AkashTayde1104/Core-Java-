package com.programs.string;

public class OneStringIsRotationOfAnother {
	public static void main(String[] args) {
		
//		String s1="xyz";
//		String s2="yzx";
//		
//		if(s1.length()!=s2.length())
//		{
//			System.out.println("2nd string not rotation of first string");
//		}
//		
//		else
//		{
//			s1=s1.concat(s1);//s1=xyzxyz so yzx is roatation of s1
//			
//			if(s1.indexOf(s2)!=-1)
//			{
//				System.out.println("2nd string is rotation of first string");
//			}
//			else
//			{
//				System.out.println("2nd string is not rotation of first string");
//			}
//		}
		
		
		// 2nd approach
		
		String str1="xyz";
		String str2="yzx";
		
		if(isRotation(str1, str2))
		{
			System.out.println("rotation of string is present");
		}
		else
		{
			System.out.println("rotation not present ");
		}
	}	
	
		public static boolean isRotation(String str1, String str2)
		{
			return (str1.length()==str2.length()) && ((str1+str1).indexOf(str2)!=-1);
			
		}


}
