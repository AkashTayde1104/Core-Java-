package com.own.practiceprograms;

import java.util.Scanner;
//using loop
public class Atm {
	public static void main(String[] args) {
		int balance=2000;
	     Scanner sc=new Scanner(System.in);
	while(true)
	{
    System.out.println("enter your choice for ATM transation \n1. check balance \n2. withdraw money \n3. Add money \n4. Exit");
    int y=sc.nextInt();
  	System.out.println("your choice is"+y);

switch(y)
{
case 1:
	System.out.println("Your balance is :"+balance);
System.out.println();
break;


case 2:System.out.println("enter money you want to withdraw");
	   int z=sc.nextInt();
	   if(z<=balance)
	   {
		int Balance= balance-z;
		System.out.println("please wait to proceed");
		System.out.println("your reamining balce is"+Balance);
	   }
	   else
		{
		System.out.println("your balance is insufficient");
		}
	   System.out.println();
break;

case 3:
	System.out.println("enter money to add");
	int yy=sc.nextInt();
	 int toatlBalance=yy + balance;
	 System.out.println("yout toatal balnce is:"+toatlBalance);
	System.out.println();
	break;
case 4:
	System.out.println("Thank you for used out service");
	System.exit(0);
	
}
}
}

}
