package com.practice;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		
		String sc="abbcddeff";
		char [] ch=sc.toCharArray();
		for(int i=0;i<sc.length();i++) {
			
			for(int j=i+1;j<sc.length();j++) {
				
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]+" ");
					break;
				}
				
			}
			
		}

	}

}
