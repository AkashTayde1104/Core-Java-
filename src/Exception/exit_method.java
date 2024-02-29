package Exception;

public class exit_method {
	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			//System.exit(0);//normal termination
			System.out.println(10/0);
			//System.exit(1);//abnormal termination but after exception rest lines won't execute in try
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
			System.exit(-8);//abnormal termination
		}
		finally {
			System.out.println("inside finally block");
		}
	}

}
