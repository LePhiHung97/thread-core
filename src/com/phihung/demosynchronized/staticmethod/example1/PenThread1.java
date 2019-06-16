package com.phihung.demosynchronized.staticmethod.example1;

public class PenThread1 extends Thread {
	public void run() {
		Pen.write(3);
	}
}
