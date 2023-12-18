package com.practice;

public class FirstNonRepeatString {

	public static void main(String[] args) {
		
		String a="window";
		
		
		for(int i=0;i<=a.length();i++) {
			char ch=a.charAt(i);
			boolean re=false;
			
			for(int j=i+1;j<a.length();j++) {
				if(ch==a.charAt(j)) {
		
					System.out.println(ch+" repeated");
					re=true;
					break;
					
				}
			}
     		if(re==false) {
     			System.out.println(ch+" non repeated");
     			break;
     		}
		}
		
	}
}