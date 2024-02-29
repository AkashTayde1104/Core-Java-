package com.programs.string;

public class findSmallest_and_LargestString {
	
	public static void main(String[] args) {
		
		String s="you are so beautiful";
		
		//take space after string to get last word from given string
		String s1=s+" ";
		
		String small="", large="", word="";
		
		String words[]=new String[100];
		
		int length=0;
		
		//get ine by one character
		for( int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);//store in c
			
			if(c!=' ')//if c not equal to space enter in loop
			{
				word=word+c;//""+y,y+o, yo+u, you  ....then go to else part
			}
			else
			{
				words[length]=word;//word store in array of words of length 0
				length++;// then length increment by 1
				word="";//word become empty
			}
		}
		small=large=words[0];//store in words of length 0 in small and large
		
		for(int k=0;k<length;k++)//iterate array one by one
		{
			if(small.length()>words[k].length())//if length of small is greater than words[k] 
				//then store that words[k] in small
			{
				small=words[k];
			}
			
			if(large.length()<words[k].length())// if legth of large is smaller than words[k]
				//then store taht words[k] in large
			{
				large=words[k];
			}
			
		}
		//print small and large word from given string
			System.out.println("smallest word= "+small);
			System.out.println("Largest word= "+large);
		
	}

}
