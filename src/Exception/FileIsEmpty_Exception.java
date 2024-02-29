package Exception;

import java.util.Scanner;

import com.tech.customizedException.FileIsEmpty;

public class FileIsEmpty_Exception {
	public static void main(String[] args) throws FileIsEmpty {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter number if you want to open file \n 1.for open \n2.for close");
		int s=sc.nextInt();
		
		
		if(s==1)
		{
			System.out.println("file is open");
			
		}
		else if(s==2)
		{
			System.out.println("file has close ");
		}
		else
		{
			throw new FileIsEmpty("You enter wrong number");
		}
	}
	}
}
	



