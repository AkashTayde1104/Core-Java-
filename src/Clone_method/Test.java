package Clone_method;

public class Test implements Cloneable  {
	String s;
	int id;
	
	Test(String s, int id)
	{
		this.s=s;
		this.id=id;
	    System.out.println(s);
	    System.out.println(id);
	}
	
	
	@Override
	public String toString() {
		return "Test s=" + s + ", id=" + id ;
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		Test t=new Test("Ram", 100);
		Test t1=(Test) t.clone();
		System.out.println(t1);
	}

}
