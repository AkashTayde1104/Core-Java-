package Exception;

public class throws_ implements Cloneable {
public void m1() throws ClassNotFoundException, CloneNotSupportedException
{
	System.out.println("inside m1");
	throws_ t=new throws_();
	t.clone();
	Class.forName("Exception.throws_");
}
public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException {
	System.out.println("main start");
	throws_ t=new throws_();
	t.m1();
	System.out.println("main end");
}
}
