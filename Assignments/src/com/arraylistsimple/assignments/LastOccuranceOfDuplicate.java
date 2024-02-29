package com.arraylistsimple.assignments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//Assign-4(last occurrence of duplicates)
public class LastOccuranceOfDuplicate {
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
		
		System.out.println("\n-------Using Collection------");
		System.out.println("Last Occurance of Duplicates in Arraylist:");
		
		Set s=new HashSet();
		for(int no:l)
		{
			boolean dupl = s.add(no);
			if(dupl==false)
			{
			System.out.println("Index : "+l.lastIndexOf(no)+" = "+(no));
		    }
		}
		
		System.out.println("\n____________________________________________________\n");
		
		System.out.println("\n-----Using For Loop----------");
		System.out.println("Last Occurance of Duplicate in Arraylist:");
		int count=0;
		for(int i=l.size()-1;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
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
//				for(int i=l.size()-1;i>=0;i--)
//				{
//					for(int j=i-1;j>=0;j--)
//					{
//						if(l.get(i)==l.get(j))
//						{
//							System.out.println("Duplicate Element of Last Occurrence: "+l.get(i));
//							count++;
//						}
//					}
//					if(count!=0)
//					{
//						break;
//					}
//				}
//				
//				
//			}
//		}

