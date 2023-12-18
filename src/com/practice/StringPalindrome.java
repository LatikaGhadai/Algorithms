package com.practice;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String sc="Adarsh";
		String rev="";
		for(int i=sc.length()-1;i>=0;i--) {
			rev=rev+sc.charAt(i);
			
		}
		if(rev.equals(sc))
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
