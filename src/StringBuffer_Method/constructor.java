package StringBuffer_Method;

public class constructor {
	public static void main(String[] args) {
		
	
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("abchgftyuiohgfdhd");
	System.out.println(sb.capacity());

	
	StringBuffer sb1=new StringBuffer(20);//externally given capacity
	System.out.println(sb1.capacity());

	
	String s=new String("helllo");
	StringBuffer sb2=new StringBuffer(s);
	System.out.println(sb2.capacity());//convert string to stringbuffer
}
}
