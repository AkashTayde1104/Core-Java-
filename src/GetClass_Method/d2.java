package GetClass_Method;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class d2 {
	public static void main(String[] args) {
		int count=0;
		Object obj=new Object();
		System.out.println(obj.getClass().getName());
		
		Class c=obj.getClass();
		System.out.println("----methods in object class---");
		Method[] m=c.getDeclaredMethods();
		for(Method mt:m)
		{
			count++;
			System.out.println(mt.getName());
		}
		System.out.println(count);
		
		System.out.println("----variables in object-----");
		Field[] f=c.getDeclaredFields();
		for(Field ft:f)
		{
			System.out.println(ft.getName());
		}
	}

}
