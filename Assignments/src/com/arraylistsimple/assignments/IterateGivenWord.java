package com.arraylistsimple.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Assign-3 (find arraylist contains "Amol" and get it using iterator)
public class IterateGivenWord {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Ram");
		l.add("Sham");
		l.add("Yogesh");
		l.add("Amol");
		l.add("Mayur");
		l.add("Sharad");
		System.out.println(l);

		System.out.println();
		boolean Contains = l.contains("Amol");
		System.out.println("Arraylist contain 'Amol': " + Contains);
		if (Contains == true) {
			Iterator<String> itr = l.iterator();
			while (itr.hasNext()) {
				Object next = itr.next();
				if (next.equals("Amol")) {
					System.out.println(next);
				}

			}
		}
	}
}




//				List<String> l=new ArrayList();
//				l.add("Ram");
//				l.add("Shyam");
//				l.add("Yogesh");
//				l.add("Amol");
//				l.add("Mayur");
//				l.add("Sharad");
//				
//				int count=0;
//				Iterator<String> itr =l.iterator();
//				while(itr.hasNext())
//				{
//					String name=itr.next();
//					if(name.equals("Amol"))
//					{
//						System.out.println("Element Found....");
//						count++;
//					}
//					
//				}
//				if(count==0)
//				{
//					System.out.println("Element Not Found...");
//				}
//				
//				
//				
//			}
//		}
