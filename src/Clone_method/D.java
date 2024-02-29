package Clone_method;

public class D implements Cloneable {
	int x=10;
	int y=30;
	int x1;
	int y1;
	public static void main(String[] args) throws CloneNotSupportedException {
		D d=new D();
		D d1=(D) d.clone();
        d1.x1=11;
        d1.y1=12;
		System.out.println(d.x+"**"+d.y);
		System.out.println(d1.x+"**"+d1.y);//use global values
		System.out.println(d1.x1+"**"+d1.y1);//used new assign values
	}

}
