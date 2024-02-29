package com.daily.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Find missing numbers

public class Day4 {
	public static void main(String[] args) {
		int[] Arr= {1,3,5,7,9,11};
		int[] array= new int[12];//giving highest value.. 
		                        //int array size-1 so mention 12		
		for(int itr:Arr)
		{
			array[itr]=1;//1= element is present
		}
		for(int i=1;i<array.length;i++)
		{
			if(array[i]==0)//0= element not preset
			{
				System.out.print(i+" ");//then print missing num.
			}
		}

			
		
//      System.out.println("___other way________");
//		Arrays.sort(Arr);//sort specified range of array in ascending 
//		int i=1;
//		
//		while(i<Arr.length)
//		{
//			if(Arr[i]-Arr[i-1]==1)//element present in array 
//			{
//				
//			}
//			else
//			{
//				System.out.println((Arr[i-1]+1));//if not print it
//			}
//			i++;
//		}
		
		System.out.println("______using collection_______");
		List<Integer> num=Arrays.asList(1,3,5,7,9,11);
		Collections.sort(num);
		int i=1;
		while(1<num.size())
		{
			if(num.get(i)-num.get(i-1)==1)
			{
				
			}else
			{
				System.out.println("missing num="+(num.get(i-1)+1));
//				num.add((num.get(i-1)+1));
//				Collections.sort(num);
			}
			i++;
		}
		}
	}


