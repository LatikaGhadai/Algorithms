package com.practice;

public class VowelinString {

	public static void main(String[] args) {
		
		String a="Helloworld";
		int Vcount =0;
		int Ccount=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
				Vcount++;
			}else {
				
				if(a.charAt(i)>'a' && (a.charAt(i)<='z'))
				{
				Ccount++;
				}
			}
		}
		
		if(Vcount>1) {
			System.out.println("vowel is present");
		}else {
			System.out.println("not present");
		}
		
	}

}
