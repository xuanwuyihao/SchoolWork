package ht_thread;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		Thread c=new Thread(new RunnableC());
		
		//�����̵߳����ȼ�
		a.setPriority(2);
		b.setPriority(5);
		c.setPriority(10);
		
		//�����߳��ò�
		a.yield();
		
		//���߳�ȡ����
		a.setName("�߳�A");
		b.setName("�߳�B");
		
		//ִ���߳�
		a.start();
		b.start();
		c.start();
	}
}
