package com.practice;

public class RemoveDuplicatetwoString {

	public static void main(String[] args) {
		
		String a="abcdefgh";
		String b="ghijklmn";
		char [] ch1=a.toCharArray();
		char []ch2=b.toCharArray();
		
		for(int i=0;i<a.length();i++) {
			
			for(int j=0;j<b.length();j++) {
				
				if(ch1[i]==ch2[j]) {
					System.out.print(ch1[i]);
				}
				
			}
			
			
		}

	}

}
