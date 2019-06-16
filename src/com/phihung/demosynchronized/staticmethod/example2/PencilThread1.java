package com.phihung.demosynchronized.staticmethod.example2;

public class PencilThread1 extends Thread{
	public void run() {
		Pencil.write(3);
	}
}
