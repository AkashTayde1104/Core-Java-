package GetClass_Method;

public class Demo {
	public static void main(String[] args) {
		Object obj=new Demo();
		Class c=obj.getClass();
		
		System.out.println(c);// get Class classname
		System.out.println(c.getName());//get only classname
	}

}
