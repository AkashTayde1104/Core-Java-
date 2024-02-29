package com.stream.asssignments;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//7. perform cube on list elements and filter no. greater than 50
public class CubeOnListElments {
	public static void main(String[] args) {
		
		System.out.println("\n________7. perform cube on list elements and filter no. greater than 50________\n");
		
		List<Integer>l=Arrays.asList(2,5,6,8,3,1,7);
		System.out.println("List: "+l);
		
		List<Integer> l1=l.stream().map(f->(f*f*f)).collect(Collectors.toList());//find cube
		System.out.println("Cube: "+l1);
		
		List<Integer> l2=l1.stream().filter(f->f>50).collect(Collectors.toList());//find cube number greater than 50
		System.out.println("Cube No>50: "+l2);
		
	    System.out.println("\n______or_________\n");
		List<Integer>ll=l.stream().map(f->(f*f*f)).filter(f->f>50).collect(Collectors.toList());//find cube & No>50
		System.out.println("Find cube & Cube No>50: "+ll);
	}
}
