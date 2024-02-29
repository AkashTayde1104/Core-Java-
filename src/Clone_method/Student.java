package Clone_method;

public class Student implements Cloneable {
	int x=10;
	int y=20;


	public static void main(String[] args) throws CloneNotSupportedException {
		int x=100;
		int y=200;
		
		Student s=new Student();
		Student s1=(Student) s.clone();
		
		 s1.x=10;
		 s1.y=20;
		 System.out.println(x);
		 System.out.println(y);
		System.out.println(s.x+"***"+s.y);
		System.out.println(s1.x+"***"+s1.y);
	}

}
