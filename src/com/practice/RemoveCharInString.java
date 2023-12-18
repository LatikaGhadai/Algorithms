package com.practice;

public class RemoveCharInString {

	public static void main(String[] args) {
		
		
				String a="adarsh";
				char ch='a';
				String d="";
				
//		StringBuffer ss=new StringBuffer(a);
//		System.out.println(ss.deleteCharAt(4));
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)!=ch) {
				d=d+a.charAt(i);
			}
			
		}
		System.out.println(d);

	}

}
