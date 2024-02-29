package com.programs.string;

//find special char and print string without spl char
public class SpeacialCharacter {
	public static void main(String[] args) {
		String s="cloudtech@";
		int count=0;
		String speacialCharRemoved="";
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c))
				{
//					System.out.println(c);
					count++;
				}
				else
				{
					speacialCharRemoved=speacialCharRemoved+c;
				}
					
			}
			if(count==0)
			{
				System.out.println("there are no spl char");
			}
			else
			{
				System.out.println("thre are found spl char "+count);
				
			}
			
	System.out.println("special character removed : "+speacialCharRemoved);
	}

}
