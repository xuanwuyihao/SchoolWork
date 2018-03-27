package ht_thread;

public class ThreadA extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+"--"+i);
		}
	}
}
