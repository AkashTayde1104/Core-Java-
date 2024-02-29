package com.programs.string;

public class CheckDigitsOnly {
	public static void main(String[] args) {
//		String s = "124";
		String s = "Hello124";
		int count = 0;
		
		String digits = "";
		
		String letter = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);

			if (!Character.isDigit(c)) {
				letter = letter + c;
				count++;
			} else {
				digits = digits + c;
			}
		}
		if (count == 0) {
			System.out.println("contains digit only : " + digits);
		} else {
			System.out.println("not contains digit only");
		}
	}

}
