package Exception;

public class Default_exception_handler {
	public void m3()
	{
		System.out.println("m3 start");
		System.out.println(10/10);
		System.out.println("Hello java");
		
	}
	
	public void m1()
	{
		this.m3();
		
	}
	public static void main(String[] args) {
		Default_exception_handler d=new Default_exception_handler();
		d.m1();
		
	}

}
