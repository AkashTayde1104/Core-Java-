package Equals_method;

public class Demo {
    String s;
	int id;
	
	public Demo(String s, int id)
	{
		this.id=id;
		this.s=s;
		
	}
	
	
	@Override
	public String toString() {
		return " Demo s=" + s + ", id=" + id ;
	}


	public static void main(String[] args) {
		Demo d=new Demo("Ram", 59);
		Demo d1=new Demo("Ramesh", 90);
		System.out.println(d1);
		System.out.println(d.equals(d1));
		Demo d3=d;
		System.out.println(d.equals(d1));
		
	}
	

}
