package com.programs.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ArrayOfOccurence {
	public static void main(String[] args) {

		int s[]= {1,2,3,4,2,3,1,3,3,6};
		
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();

		
		for(int i=0;i<s.length;i++)
		{

			if(m.get(s[i])==null)
			{
				m.put(s[i],1);
			}
			else 
			{
				m.put(s[i], m.get(s[i])+1);
			}
		}
		System.out.println(m);
		
		Set<Entry<Integer, Integer>> entrySet = m.entrySet();
		
		//using 1.8
		m.entrySet().stream().forEach(c->System.out.println(c.getKey()+""+c.getValue()));
		
		
//		//Using iterator
//		
//		Iterator<Entry<Integer, Integer>> itr = m.entrySet.iterator();
//		while(itr.hasNext())
//		{
//			Entry<Integer, Integer> next = itr.next();
//			System.out.println(next.getKey()+""+next.getValue());
//		}
//		
//		//using for each
//	    for(Entry<Integer,Integer> ele:entrySet)
//		{
//			System.out.println(ele.getKey()+""+ele.getValue());
//		}
	}


}
