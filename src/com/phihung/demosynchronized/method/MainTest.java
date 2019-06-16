package com.phihung.demosynchronized.method;

public class MainTest {
	public static void main(String[] args) {
		final Math m = new Math();
		final Math m2 = new Math();
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					m.printNumbers(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				try {
					m2.printNumbers(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(r, "ONE").start();
		new Thread(r2, "TWO").start();
	}
}
