package ht_thread;

public class RunnableC implements Runnable{
	/**
	 * �̣߳��ǿ���ͬʱ���еĶ�������
	 * @author Administrator
	 * 1���½�һ����ȥ�̳�Thread�� �� ʵ�� Runnable�ӿ�
	 * 2��ʵ�� run���� ����run�б�д��Ҫ�������е��߼�
	 * 3��ʵ������ ���ö����start������ʼ�߳� start�������Զ�����run����
	 * 
	 * �̵߳�4��״̬���½� - ���� - ���� - ����
	 */

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("�߳�C"+i);
		}
	}

}
