package com.practice;

public class RemoveDuplicateStringCount {

	public static void main(String[] args) {
	String sc="adarsh";
char [] ch=sc.toCharArray();
	
	
	for(int i=0;i<sc.length();i++) {
		
		int count=1;
		for(int j=i+1;j<sc.length();j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]=' ';
			}
		}
		if(ch[i]!=' ') {
			System.out.println(ch[i]+" : "+count);
		}
	}

	}

}
