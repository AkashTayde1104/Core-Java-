package com.programs.string;

public class FindConsonant_Vovels_countFromString {
	public static void main(String[] args) {
		
	
	String s="I am Aishwarya";
	
	int vCount=0, cCount=0;
	
	 s=s.toLowerCase();
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
		{
			vCount++;
		}
		else
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				cCount++;
			}
		}
	
}
	System.out.println("Vovels = "+vCount);
	System.out.println("Constants = "+cCount);

}
}