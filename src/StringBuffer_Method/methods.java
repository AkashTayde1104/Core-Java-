package StringBuffer_Method;

public class methods {
	public static void main(String[] args) {
		char ch[]= {'a','b','c'};
		StringBuffer sb=new StringBuffer("welcome");
		sb.toString();//convert stringbuffer to string
		System.out.println(sb);
		System.out.println(sb.length());//length()
		System.out.println(sb.charAt(0));//charAt
		System.out.println(sb.capacity());//capacity
		System.out.println(sb);
		sb.setCharAt(0, 'W');
		System.out.println(sb);//SetCharAt(index,char)
		sb.append(" to Java ");
		sb.append(ch);
		System.out.println(sb);//append
		System.out.println(sb.insert(2, "kam"));//insert(index,string)
		System.out.println(sb.deleteCharAt(3));//deleteCharAt(index)
		System.out.println(sb.delete(3, 6));//deleteCHarAt(index begin,end)
		System.out.println(sb.reverse());//Reverse
		sb.setLength(3);
		System.out.println(sb);//setlength(new length)
	
		
		StringBuffer sb1=new StringBuffer("welcome");
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(500);//ensurecapacity(int capacity)
		sb1.trimToSize();
		System.out.println(sb1.capacity());//trimtoSize
		sb.toString();
		System.out.println(sb);
		
	}

}
