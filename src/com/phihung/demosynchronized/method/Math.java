package com.phihung.demosynchronized.method;

public class Math {
	 synchronized static void printNumbers(int n) throws InterruptedException {
		for(int i = 0 ;i < n; i ++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			Thread.sleep(500);
		}
		
	}
}
