package Revision;

public class Equals_method {
	public static void main(String[] args) {
		Equals_method e=new Equals_method();
		System.out.println(e);
		Equals_method e1=new Equals_method();
		System.out.println(e1);
		System.out.println(e.equals(e1));
	    Equals_method e2=e;
	    System.out.println(e2);
		System.out.println(e.equals(e2));
	}

}
