package ht_Tickets;


public class TicketsSale implements Runnable{
	int cont=100;
	public void run() {
		
			while (true) {
				synchronized (this) {
				if (cont<=0) {
					System.out.println("Ʊ�����꣡");
					break;
				}
				cont--;
				System.out.println(Thread.currentThread().getName()+"����"+cont+"��Ʊ��");
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
		
	}
	public static void main(String[] args) {
		TicketsSale t=new TicketsSale();
		Thread th=new Thread(t,"����վ");
		Thread th1=new Thread(t,"�Ϻ�վ");
		Thread th2=new Thread(t,"����վ");
		
		th.start();
		th1.start();
		th2.start();
		
	}
}
