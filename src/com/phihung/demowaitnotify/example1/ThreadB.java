package com.phihung.demowaitnotify.example1;

public class ThreadB extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++)
				total += i;
			notify();
		}
	}
}
