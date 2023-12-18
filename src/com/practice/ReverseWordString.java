package com.practice;

public class ReverseWordString {

	public static void main(String[] args) {
		String a="My name is Adarsh";
		String b[]=a.split(" ");
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(b[i]+" ");
		}

	}

}
