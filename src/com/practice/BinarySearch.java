package com.practice;

public class BinarySearch {

	public static void main(String args[]) {
		int a[]= {2,4,6,8,9,10,12};
		int s=8;
		int li=0;
		int hi=a.length;
		int mi=(li+hi)/2;
		
		while(li<=hi) {
			if(a[mi]==s) {
				System.out.println("element is at"+mi+" index position");
				break;
			}
			else if(a[mi]<s) {
				li=mi+1;
			}
			else 
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("element not found");
		}
	}
}
