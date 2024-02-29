package com.own.practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfStringChar {
	
	public static void getcharcount(String name)
	{
		Map<Character, Integer>charmap=new HashMap<Character, Integer>();
		
		char[] strarray = name.toCharArray();//convert string to char array
		for(char c: strarray)//stire in one variable
		{
			if(charmap.containsKey(c))//if map contains key already then its value increment by one
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
			{
				charmap.put(c, 1);// if map doesn't contains key then add in map
			}
		}
		System.out.println(name +" : "+charmap);// print char with its occurance
	}
	public static void main(String[] args) {
		
		OccurenceOfStringChar.getcharcount("test");//call that method
	}

}
