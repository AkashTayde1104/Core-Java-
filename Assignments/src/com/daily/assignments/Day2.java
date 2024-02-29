package com.daily.assignments;

public class Day2 {
	
	public static int execute()
	{
		try
		{
			System.out.println("Inside try");
			throw new RuntimeException();//exception occur in try so goes to catch block
		}catch(Exception e)
		{
			System.out.println("Inside Catch");//catch block handle excption which occur in try block
			return 5;
		}finally
		{
			System.out.println("inside finally");// and whatever resources are open in try block
			return 10;                        // will be close in finally block and return 10
		}                                    //i.e. finally block always execute whether exception occurred or not
		                                    // and rest of the code will be executed
	}
	public static void main(String[] args) {
		int result = Day2.execute();
		System.out.println("Result ="+result);//Exception occur in try block it will be handled by catch block
		                                      //and execute finally block always and execute rest of the code
		                                      
	}
	

}
