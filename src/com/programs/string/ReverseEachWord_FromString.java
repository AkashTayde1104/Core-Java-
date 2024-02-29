package com.programs.string;

public class ReverseEachWord_FromString
{
	public static void main(String[] args) {
		String s="java is boss";
		
		String[] ss = s.split(" ");//first split string from space & store in array of string as a word
		
		String revstring="";
		
		String revword="";
		
		for(int i=0;i<ss.length;i++)
		{
			String word = ss[i];//store each word in string
			
//			System.out.println(word);
			
			//reverse each word one by one
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);//""+a, a+v, av+a, ava+j, avaj
			}
			//store rev words in revstring
			revstring=revstring+revword+" ";//""+avaj" " , avaj +si" " ,  avaj is +ssob" ", avaj is ssob
			
			revword="";//empty revword
		}
		System.out.println(revstring);//print revstring
		
		
	}

}
