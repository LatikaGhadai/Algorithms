package com.practice;

public class PyramidChar {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print(ch+" ");
				
			}
			System.out.println();
			ch++;
		}
	}

}
