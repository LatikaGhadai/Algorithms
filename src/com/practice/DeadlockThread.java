package com.practice;

public class DeadlockThread {
	
	private static Object resource1=new Object();
	private static Object resource2=new Object();

	public static void main(String[] args) {
		
		
		Thread t1=new Thread(()->{
		
		synchronized(resource1) {
			System.out.println("This is resource1");
		
		try {
			Thread.sleep(1000);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		synchronized(resource2) {
			System.out.println("This is resource2");
		}
		}
		
		});
		
		Thread t2=new Thread(()->{
			
			synchronized(resource1) {
				System.out.println("This is resource1");
			
			try {
				
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			synchronized(resource2) {
				System.out.println("This is resource2");
			}
			
			}
			
			});
		
		
		t1.start();
		t2.start();
		
	}

}
