package com.phihung.demoyield;

public class ThreadA extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++)
			System.out.println("Thread A " + i);
		Thread.yield();// Thread có độ ưu tiên cao tuy nhiên sẽ nhường cho thread khác hoàn thành trước

	}
}
