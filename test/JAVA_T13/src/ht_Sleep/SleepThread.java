package ht_Sleep;

import java.io.IOException;

public class SleepThread extends Thread{
	@Override
	public void run() {
		
		try {
			//���߳�����������
			sleep(3*1000*60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SleepThread t=new SleepThread();
		t.start();
		System.out.println("�߳����������ӣ�");
		try {
			//���ռ���ֵ
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���������߳�
		t.interrupt();
		System.out.println("�߳����ѣ�");
	}
}
