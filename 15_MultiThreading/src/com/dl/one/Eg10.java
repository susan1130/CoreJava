package com.dl.one;

class Aa extends Thread {
	public synchronized void m1() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());

			try {
				Thread.sleep(1400);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class Bb extends Thread {

	Aa a;
	
	public Bb(Aa a) {
		this.a = a;
	}

	@Override
	public void run() {

		a.m1();
	}
}

class Cc extends Thread {

	Aa a;

	public Cc(Aa a) {
		this.a = a;
	}

	@Override
	public void run() {

		a.m1();
	}
}

class Dd extends Thread {

	Aa a;

	public Dd(Aa a) {
		this.a = a;
	}

	@Override
	public void run() {

		a.m1();
	}
}

public class Eg10 extends Thread {

	Aa a;

	public Eg10(Aa a) {

		this.a = a;
	}

	public void run() {

		a.m1();
	}

	public static void main(String[] args) {
		
		Aa a = new Aa();
		Bb b = new Bb(a);
		Cc c = new Cc(a);
		Dd d = new Dd(a);
		
		b.start();
		c.start();
		d.start();
	}

}
