package Revision;

public class tostring_ex {
	public void m1()
	{
		int A=10;
		int B=20;
		int c=A+B;
		System.out.println(c);
	}
	
	
	@Override
	public String toString() {
		return "tostring_ex []";
	}


	public static void main(String[] args) {
		tostring_ex e=new tostring_ex();
		System.out.println(e);
		e.m1();
	}

}
