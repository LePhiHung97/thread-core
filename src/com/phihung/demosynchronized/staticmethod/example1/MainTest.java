package com.phihung.demosynchronized.staticmethod.example1;

public class MainTest {
	public static void main(String[] args) {
		PenThread1 t1 = new PenThread1();
		PenThread2 t2 = new PenThread2();
		
		t1.start();
		t2.start();
		
	}
}
