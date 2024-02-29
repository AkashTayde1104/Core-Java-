package com.programs.string;

public class RemoveDigits {
	public static void main(String[] args) {
		String s = "hello123";
		int count = 0;
		String letter = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (!Character.isDigit(c)) {
				letter = letter + c;
			}

		}

		System.out.println("remove digits : " + letter);

	}

}
