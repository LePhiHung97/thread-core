package com.phihung.demosynchronized.staticmethod.example1;

public class Pen {
	static void write(int n) {
		synchronized (Pen.class) {
			for(int i = 0 ;i < 3; i ++)
			{
				System.out.println(Thread.currentThread().getName() + " " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
		}
	}
}
