package com.practice;

public class RotationalSrtring {

	public static void main(String[] args) {
		
		String a="Adarsh";
		String b="darshA";
		
	String newString=a.concat(a);
	 if(newString.contains(b)) {
		 
		 System.out.println("Rotationa String");
		 
	 }else {
		 System.out.println("Non Rotational String");
	 }

	}

}
