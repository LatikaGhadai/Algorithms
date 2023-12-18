package com.practice;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String a="abbcadghijkll";
		System.out.println("Old String :"+a);
		System.out.println("new String is :"+removeDuplicate(a));

	}
	public static String removeDuplicate(String a) {
		
		String newS="";
		
		for(int i=0;i<a.length();i++) {
			
			char ch=a.charAt(i);
			if(newS.indexOf(ch)==-1) {
				
				newS=newS+ch;
				
			}
		}
		
		return newS;
	}
	

}
