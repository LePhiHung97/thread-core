package com.phihung.demosynchronized.staticmethod.example2;

public class MainTest {
	public static void main(String[] args) {
		PencilThread1 t1 = new PencilThread1();
		PencilThread1 t2 = new PencilThread1();

		
		
		t1.start();
		t2.start();
	}
}
