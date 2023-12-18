package com.practice;

import java.util.HashSet;

public class UnsortedArrayRemoveDuplicate {

	public static void main(String[] args) {
		int a[]= {1,6,4,5,5,4,3,2,6};
		
		HashSet<Integer> has=new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			has.add(a[i]);
		}
		for(int no:has) {
			System.out.print(no);
		}

	}

}
