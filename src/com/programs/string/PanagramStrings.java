package com.programs.string;

//it contains all character from a-z
public class PanagramStrings {
	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s.toLowerCase()));
	}
	
	public static boolean isPanagram(String s)
	{
		if(s.length()<26)
		{
			return false;
		}
		else
		{
			for(char ch='a'; ch<='z';ch++)
			{
				if(s.indexOf(ch)<0)// index of each char is not zero
				{
					return false;
				}
			}
			
		}
		return true;
		
	}

}
