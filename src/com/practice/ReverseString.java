package com.practice;

public class ReverseString {

	public static void main(String[] args) {
	 String sc="Adarsh";
	 String rev="";
	 for(int i=sc.length()-1;i>=0;i--) {
		 rev=rev+sc.charAt(i);
	 }
	 System.out.println(rev);
	 

	}

}
