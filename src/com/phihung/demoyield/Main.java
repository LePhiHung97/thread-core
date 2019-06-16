package com.phihung.demoyield;

public class Main {
	public static void main(String[] args) {
		
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		a.setPriority(10);
		b.setPriority(1);
		
		a.start();
		b.start();
	}
}
