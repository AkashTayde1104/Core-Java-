package Exception;

public class methods {
	public static void main(String[] args) {
		System.out.println("mai start");
		try
		{
			System.out.println(10/0);
			
		}
		catch(Exception a)
		{
			a.printStackTrace();
			
			String s=a.toString();
			System.out.println(s);
			
			a.getMessage();
		}
		System.out.println("main end");
	}

}
