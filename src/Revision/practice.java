package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class practice  {

	public static void main(String[] args) {
		String s="aabbccss";
		Map<Character, Integer> m=new HashMap();
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(m.get(c)==null)
			{
				m.put(c, 1);
			}
			else
				
			{
				m.put(c, m.get(c)+1);
			}
		}
		System.out.println(m);
		
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for(Entry<Character, Integer> set:entrySet)
		{
			System.out.print(set.getKey()+""+set.getValue());
		}
		
		
	}
}
	

