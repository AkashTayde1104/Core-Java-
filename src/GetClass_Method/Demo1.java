package GetClass_Method;

import java.lang.reflect.Method;

public class Demo1 {
	public void m1()
	{
		System.out.println("m1() called");
	}
	public void m2()
	{
		System.out.println("m2() called");
	}
	public static void main(String[] args) {
		int count=0;
		Object obj=new Demo1();
		Class c=obj.getClass();
		System.out.println(c.getName());
		
		Method[] m=c.getDeclaredMethods();
		
		for(Method x:m)
		{
			count++;
			System.out.println(x.getName());
		}
		System.out.println("count=" +count);
		
	}

}
