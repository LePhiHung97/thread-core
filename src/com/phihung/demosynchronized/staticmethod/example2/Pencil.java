package com.phihung.demosynchronized.staticmethod.example2;

public class Pencil {
	synchronized static void write(int n) {
		for(int i = 0 ; i< n; i++) {			
			System.out.println(Thread.currentThread().getName() + " write  " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
