package com.programs.string;

public class ReverseOrderOfStringSentence {
	public static void main(String[] args) {
		
		String s="java is boss";
//		String s1=s+" ";//if not giving space we just get "is java" after reverse
//		//bcoz loop break if get space between 2 word 
//		
////		System.out.println(s1);
//		String word="", rev="";
//		for(int i=0;i<s1.length();i++)
//		{
//			char c = s1.charAt(i);
//			
//			if(c!=' ')
//			{
//				word=word+c;
//			}
//			else
//			{
//				rev=word+" "+rev;
//				word=" ";
//			}
//		}
//		System.out.println(rev);
		
		
//		[java, is, boss]
		String[] ss = s.split(" ");
		String rev="";
		
		for(int i=0;i<ss.length;i++)
		{
			String word = ss[i];//one by one word store word
//			System.out.print(word+" ");
			
	
			rev= word+" "+rev;//java +"", is +java , boss +is java , final =boss is java
		}
		System.out.println(rev);//boss is java
		
	}


}


