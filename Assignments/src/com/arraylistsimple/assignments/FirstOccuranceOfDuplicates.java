package com.arraylistsimple.assignments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//Assign-2 (find first occurrence of duplicate in arraylist )
public class FirstOccuranceOfDuplicates {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(20);
		l.add(9);
		l.add(50);
		l.add(10);
		l.add(25);
		System.out.println(l);
		
		System.out.println("\n------Using Collection------");
		System.out.println("First Occurrence of Duplicates in Arraylist:");	
		
		Set s=new LinkedHashSet();
		for(int no:l)
		{
			boolean dupl = s.add(no);
			if(dupl==false)
			{
				System.out.println("Index: "+l.indexOf(no)+ " = "+(no));
			}
		}
		
		System.out.println("\n____________________________________\n");
		
		System.out.println("-----Using For Loop--------");
		System.out.println("First Occurrence of Duplicate in Arraylist:");
		int count=0;
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)==l.get(j))
				{
					System.out.println(l.get(i));
					count++;
			    }
			}
			if(count!=0)
			{
				break;
			}
		}
	}
}
		
		
				
//				List l=new ArrayList();
//				l.add(10);
//				l.add(20);
//				l.add(30);
//				l.add(50);
//				l.add(20);
//				l.add(9);
//				l.add(50);
//				l.add(10);
//				l.add(25);
//				
//				int count=0;
//				for(int i=0;i<l.size();i++)
//				{
//					for(int j=i+1;j<l.size();j++)
//					{
//						if(l.get(i)==l.get(j))
//						{
//							System.out.println("First Occurrence of Duplicate Element: "+l.get(i));
//							count++;
//						}
//					}
//					if(count != 0)
//					{
//						break;
//					}
//				}
//				
//				
//			}
//		}

