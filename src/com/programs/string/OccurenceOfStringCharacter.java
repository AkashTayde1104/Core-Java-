package com.programs.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfStringCharacter {
	public static void main(String[] args) {
		String s="aaaabbbccdd";
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(m.get(ch)==null)
			{
				m.put(ch,1);
			}
			else 
			{
				m.put(ch, m.get(ch)+1);
			}
		}
		System.out.println(m);
		
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		
		//using 1.8
		m.entrySet().stream().forEach(c->System.out.println(c.getKey()+""+c.getValue()));
		
		
//		//Using iterator
//		
//		Iterator<Entry<Character, Integer>> itr = m.entrySet.iterator();
//		while(itr.hasNext())
//		{
//			Entry<Character, Integer> next = itr.next();
//			System.out.println(next.getKey()+""+next.getValue());
//		}
//		
//		//using for each
//	    for(Entry<Character,Integer> ele:entrySet)
//		{
//			System.out.println(ele.getKey()+""+ele.getValue());
//		}
	}

}
