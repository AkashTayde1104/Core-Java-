package Exception;

import java.util.Scanner;

//with finally
public class Without_try_with_resources {
public static void main(String[] args) {
	Scanner sc=null;
	try {
		sc=new Scanner(System.in);
		System.out.println("eneter number:");
		int x=sc.nextInt();
		System.out.println(10/x);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("inside finally block");
		sc.close();
	}
	System.out.println("eneter number");
	sc.nextInt();
}
}
