package com.arraylistsimple.assignments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//Assign-1(index of first occurrence of duplicate in arraylist)

public class FirstOccuranceOfDuplicateIndex {
	public static void main(String[] args) {
        List<Integer> l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(20);
		l.add(9);
		l.add(50);
		System.out.println(l);
		
		System.out.println("\n-------Using Collection-----");
		System.out.println("Index of First Occurrence of Duplicates in Arraylist:");
		
        Set s = new LinkedHashSet();
        for (int no : l)
		{
			boolean dupl = s.add(no);
			if (dupl == false) 
			{
				System.out.println(l.indexOf(no));
			}
		}
        
		System.out.println("_________________________________________________\n");//

		System.out.println("--------Using For Loop---------");
		System.out.println("Index of First Occurrence of Duplicate in Arraylist:");
		
		int count = 0;
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) == l.get(j))
				{
					System.out.println( l.indexOf(l.get(i)));
					count++;
				}
				}
			   if (count != 0)
			   {
				break;
			   }
			   }
		}
}






//		
//				List l = new ArrayList();
//				l.add(10);
//				l.add(20);
//				l.add(30);
//				l.add(50);
//				l.add(20);
//				l.add(9);
//				l.add(50);
//
//				int count=0;
//				for (int i = 0; i < l.size(); i++) 
//				{
//					for (int j = i+1; j < l.size(); j++) 
//					{
//						if (l.get(i) == l.get(j))
//						{
//							System.out.println("Index of First occurrence of an Duplicate Element: "+l.indexOf(l.get(i)));
//							count++;
//						}
//					}
//					if(count!=0)
//					{
//						break;
//					}
//				}
//
//			}
//}
