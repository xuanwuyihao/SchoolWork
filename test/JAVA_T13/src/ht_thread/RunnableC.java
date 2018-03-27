package ht_thread;

public class RunnableC implements Runnable{
	/**
	 * 线程：是可以同时运行的独立过程
	 * @author Administrator
	 * 1、新建一个类去继承Thread类 或 实现 Runnable接口
	 * 2、实现 run方法 ，在run中编写需要独立运行的逻辑
	 * 3、实例化类 调用对象的start方法开始线程 start方法会自动调用run方法
	 * 
	 * 线程的4个状态：新建 - 就绪 - 死亡 - 阻塞
	 */

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("线程C"+i);
		}
	}

}
