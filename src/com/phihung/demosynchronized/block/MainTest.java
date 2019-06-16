package com.phihung.demosynchronized.block;

public class MainTest {
	public static void main(String[] args) {
		final Math math = new Math();

		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					math.printNumbers(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(r, "ONE").start();
		new Thread(r, "TWO").start();
	}
}
