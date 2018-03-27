package ht_thread;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		Thread c=new Thread(new RunnableC());
		
		//设置线程的优先级
		a.setPriority(2);
		b.setPriority(5);
		c.setPriority(10);
		
		//设置线程让步
		a.yield();
		
		//给线程取名字
		a.setName("线程A");
		b.setName("线程B");
		
		//执行线程
		a.start();
		b.start();
		c.start();
	}
}
