package GetClass_Method;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class d1 {
	int x=10;
	public void m1()
	{
		System.out.println("m1");
	}
	public static void main(String[] args) {
		int count=0;
		d1 d=new d1();
		System.out.println(d.getClass().getName());
		
		Class c=d.getClass();
		//d class variables
		Field[] m=c.getDeclaredFields();
		for(Field mt:m)
		{
			//count++;
			System.out.println(mt.getName());
		}
		//System.out.println(count);
		//d class methods
		Method[] m1=c.getDeclaredMethods();
		for(Method m11:m1)
		{
			count++;
			System.out.println(m11.getName());
		}
		System.out.println(count);
		
		
				

}
}
