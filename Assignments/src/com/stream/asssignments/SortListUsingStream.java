package com.stream.asssignments;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Assign 5 and 6
public class SortListUsingStream {
	public static void main(String[] args) {
		
	System.out.println("\n___________5. sort all values present in list using stream___________\n");
	List<Integer> l=Arrays.asList(20,15,8,49,25,98,12,15,2,98);
	System.out.println("List: "+l);
	
	List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
	System.out.println(l1);
	
	
	System.out.println("\n___________6. Sort all values present in list in descending order___________\n");
	List<Integer> l2=l.stream().sorted((s1,s2)->-s1+s2).collect(Collectors.toList());
	System.out.println(l2);
	}
}
