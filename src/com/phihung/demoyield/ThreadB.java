package com.phihung.demoyield;

public class ThreadB extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++)
			System.out.println("Thread B " + i);
	}
}
