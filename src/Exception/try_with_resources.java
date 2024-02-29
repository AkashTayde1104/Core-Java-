package Exception;

import java.util.Scanner;

//without finally
public class try_with_resources {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("enter number:");
		int x=sc.nextInt();
		System.out.println(10/x);
	}
	catch(Exception e)
	{
		System.out.println("inside catch block");
		e.printStackTrace();
	}
}

}

