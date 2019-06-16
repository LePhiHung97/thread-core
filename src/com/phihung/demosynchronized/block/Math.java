package com.phihung.demosynchronized.block;

public class Math {
	void printNumbers(int n) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName()  + "Start");
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				Thread.sleep(1000);
			}
		}
		System.out.println(Thread.currentThread().getName() + "End");
	}
}
