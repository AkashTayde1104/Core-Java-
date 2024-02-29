package com.programs.string;

public class PalindromeString {
	public static void main(String[] args) {
//		String s="madam";

//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char c = s.charAt(i);
//			
//			rev=rev+c;
//		}
////		System.out.println(rev);
//		
//		if(rev.equals(s))
//		{
//			System.out.println("String is palindrome");
//		}
//		else
//		{
//			System.out.println("String is not palindrome");
//		}
//		

		String s1 = "My name is nitin and i can speak malayalam";

		String[] ss = s1.split(" ");

		String w = "";
		for (String words : ss) {
			if (isPalindrome(words)) {
				System.out.println(words);
			}

		}

	}

	// nitin
	public static boolean isPalindrome(String get) {

		int i1 = 0;
		int i2 = get.length() - 1;

		while (i2 > i1) {
			if (get.charAt(i1) != get.charAt(i2)) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;

	}

}
