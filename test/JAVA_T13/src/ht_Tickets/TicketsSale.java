package ht_Tickets;


public class TicketsSale implements Runnable{
	int cont=100;
	public void run() {
		
			while (true) {
				synchronized (this) {
				if (cont<=0) {
					System.out.println("票已售完！");
					break;
				}
				cont--;
				System.out.println(Thread.currentThread().getName()+"售了"+cont+"张票！");
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
		Thread th=new Thread(t,"广州站");
		Thread th1=new Thread(t,"上海站");
		Thread th2=new Thread(t,"深圳站");
		
		th.start();
		th1.start();
		th2.start();
		
	}
}
