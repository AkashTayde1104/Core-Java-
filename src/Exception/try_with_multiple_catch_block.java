package Exception;

public class try_with_multiple_catch_block {
	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println("try start");
			
			String s="1";
			int y=Integer.parseInt(s);
			System.out.println(10/y);
			System.out.println("try end");
			
			String ss=null;
			System.out.println(ss.toString());
		}
		catch(NullPointerException n)
		{
			System.out.println("Inside catch block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("please enter non-zero value");
		}
		catch(NumberFormatException e) {
			System.out.println("please enter number");
		}
		System.out.println("main end");
	}

}
