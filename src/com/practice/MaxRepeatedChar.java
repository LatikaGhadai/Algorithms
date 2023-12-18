package com.practice;

public class MaxRepeatedChar {

	public static void main(String[] args) {
		
		String a="abcdeffggg";
		
		int []arr=new int[127];
		int max=-1;
		char c=' ';
		
		for(int i=0;i<a.length();i++) {
			
			arr[a.charAt(i)]=arr[a.charAt(i)]+1;
			
			}
		for(int i=0;i<a.length();i++) {
			
			if(max<arr[a.charAt(i)]) {
				
				max=arr[a.charAt(i)];
				c=a.charAt(i);
			}
		}
		System.out.println("MAx char is "+c);
	}

}
