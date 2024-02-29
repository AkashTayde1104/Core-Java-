package com.statements;

public class Even_odd_number_loop {
	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
		 if(i%2==0)
		 {
			 System.out.println("even no="+i);//even no.
		 }
		 i++;
		 
		}
		
		System.out.println();
		
		int j=1;
		while(j<=10)
		{
			if(j%2!=0)
			{
				System.out.println("odd no="+j);
			}
			j++;
		}

}
}