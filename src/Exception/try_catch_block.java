package Exception;

public class try_catch_block {
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
			System.out.println("Exception:/by zero");
		}
		System.out.println("main end");
		
	}

}
