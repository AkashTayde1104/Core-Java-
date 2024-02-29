package Revision;

import java.lang.reflect.Method;

public class getclass_method {
	public void m1()
	{
		System.out.println("m1");
	}
	public static void main(String[] args) {
		int Count=0;
		Object obj=new getclass_method ();
		Class c=obj.getClass();
		System.out.println(c);
		System.out.println(c.getName());
		
		Method[] m=c.getDeclaredMethods();
		for(Method x:m)
		{
			Count++;
			System.out.println(x.getName());
		}
		
		System.out.println("count="+Count);
		
	}

}
