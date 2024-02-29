package Exception;

public class try_catch_finally { 
	public static void main(String[] args) {
		System.out.println("main start");
		try
		{
			System.out.println("try start");
			System.out.println(10/0);
			System.out.println("try end");
		}
		catch(ArithmeticException a)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally");
		}
	}

}
