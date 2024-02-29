package Exception;

import java.util.Scanner;

import com.tech.customizedException.InsufficiantBalanceException;
import com.tech.customizedException.WrongPinException;

public class Balance_Exception {
public static void main(String[] args) throws WrongPinException  {
	Scanner sc=new Scanner(System.in);
	//scan ATM first
	System.out.println("scan your Atm First \nif you scanned then press 'y'");
	char x=sc.next().charAt(0);
	if(x=='y')
	{
		//Enter ATM pin
		System.out.println("enter pin");
		int s=sc.nextInt();
		System.out.println("your pin is="+s);
		if(s==123)
		{
			System.out.println("pin has been matched");
		}
		else
		{
			throw new WrongPinException("Your enter wrong pin");
		}
		 //If PIN matched then enter choices
	     System.out.println("enter your choice \n 1. check balance \n 2.withdraw money 3. Add money");
	     int y=sc.nextInt();
       	 System.out.println("your choice is"+y);
	
	switch(y)
	{

	case 1:
		System.out.println("Your balance is xxxx");
	
	break;
	
	
	case 2:System.out.println("enter money you want to withdraw");
		   int z=sc.nextInt();
		   if(z<=1000)
		   {
			System.out.println("please wait to proceed");
		   }
		   else
			{
			throw new InsufficiantBalanceException("your balance is insufficient");
		    }
		  
	break;
	
	
	case 3:
		System.out.println("enter money to add");
		
	
	break;
	
	default:System.out.println("you enter wrong choice");
	}
	}
	
	
}
}
