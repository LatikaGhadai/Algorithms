package com.practice;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		Random rn=new Random();
		for(int i=4;i>=0;i--) {
			int rnm=rn.nextInt(i+1);
			int temp=a[rnm];
			a[rnm]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
		

	}

}
