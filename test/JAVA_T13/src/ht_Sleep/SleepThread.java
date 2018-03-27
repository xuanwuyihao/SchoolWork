package ht_Sleep;

import java.io.IOException;

public class SleepThread extends Thread{
	@Override
	public void run() {
		
		try {
			//让线程休眠三分钟
			sleep(3*1000*60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SleepThread t=new SleepThread();
		t.start();
		System.out.println("线程休眠三分钟！");
		try {
			//接收键盘值
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//唤醒休眠线程
		t.interrupt();
		System.out.println("线程已醒！");
	}
}
