package com.daily.assignments;

//find even words from string

public class Day1 {
	public static void main(String[] args) {
		String s="the sky is blue and vast";
		System.out.println("____1st way___________");
		
//		System.out.println(word);// return hashcode
		
		for(String words: s.split(" "))//split used to convert string to words and stored in words i.e.in one reference variable
		{
			//System.out.println(words);//print word separately
			
			if(words.length()%2==0)//find even word
			{
				System.out.print(words+" ");
			}
		}
		
		
		System.out.println("__________2nd way________");
		
		String[] word=s.split(" ");//convert string to array of word or split string into word
		int[] wordlength=new int[word.length];//create array to store length of 
		for(int i=0;i<word.length;i++)//calculate length of each word and store in array
		{
			wordlength[i]=word[i].length();
			if(wordlength[i]%2==0)//check length of word is even
			{
				System.out.println(word[i]);
			}
		}
	
		
		
	}

	

}
