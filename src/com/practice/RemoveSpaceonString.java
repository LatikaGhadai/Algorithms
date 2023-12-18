package com.practice;

public class RemoveSpaceonString {

	public static void main(String[] args) {
		String sc="I am a Programmer";
		String re="";
		for(int i=0;i<sc.length();i++) {
			if(sc.charAt(i)!=' ') {
				re=re+sc.charAt(i);
			}
		}
		System.out.println(re);

	}

}
