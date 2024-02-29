package Equals_method;

public class Demo1 {
	public void m1()
	{
		System.out.println("m1 caalled method");
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		Demo1 d1=new Demo1();
		System.out.println(d);
		System.out.println(d1);
		Demo1 d2=d;
		System.out.println(d.equals(d2));
		System.out.println(d.equals(d1));
		
	}

}
